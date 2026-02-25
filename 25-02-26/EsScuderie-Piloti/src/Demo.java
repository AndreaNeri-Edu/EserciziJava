import java.util.Scanner;
import java.io.*;

public class Demo {

    static Scanner tas = new Scanner(System.in);
    static final String FILE_PILOTI = "piloti.txt";
    static final String FILE_SCUDERIE = "scuderie.txt";

    public static void main(String[] args) {
        while(true) {
            System.out.println("\nMenu");
            System.out.println("1.Aggiungi scuderia\n2.Aggiugi pilota\n3.Conta piloti di una scuderia\n4.facoltativo");


            int scelta = tas.nextInt();
            tas.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiScuderia();
                    break;
                case 2:
                    aggiungiPilota();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Errore: Comando non valido");
            }
        }
    }

    public static void validaCodiceScuderia(String cod) throws ScuderiaGiaPresenteException {
        try (Scanner s = new Scanner(new File(FILE_SCUDERIE))) {
            while (s.hasNextLine()) {
                String riga = s.nextLine();
                String[] parti = riga.split(";");
                if (parti[0].equalsIgnoreCase(cod)) {
                    throw new ScuderiaGiaPresenteException("Errore: scuderia "+cod+" già presente");
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore: archivio scuderie non trovato");
        }
    }

    public static void validaCodicePilota(String cod) throws PilotaGiaPresenteException {
        try (Scanner s = new Scanner(new File(FILE_PILOTI))) {
            while (s.hasNextLine()) {
                String riga = s.nextLine();
                String[] parti = riga.split(";");
                if (parti[0].equalsIgnoreCase(cod)) {
                    throw new PilotaGiaPresenteException("Errore: pilota "+cod+" già presente");
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore: archivio piloti non trovato");
        }
    }

    public static void aggiungiScuderia() {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(FILE_SCUDERIE, true));

            System.out.println("Codice scuderia: ");
            String cod = tas.nextLine();
            validaCodiceScuderia(cod);

            System.out.println("Nome scuderia: ");
            String nome = tas.nextLine();
            System.out.println("Sede: ");
            String sede = tas.nextLine();

            Scuderia scuderia = new Scuderia(cod, nome, sede);
            pw.println(scuderia.toString());
            pw.close();
            System.out.println("Scuderia aggiunto con successo");
        } catch (ScuderiaGiaPresenteException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file scuderie non trovato");
        }

    }

    public static void aggiungiPilota() {
        System.out.println("Codice scuderia del pilota: ");
        String codS = tas.nextLine();

        try {
            boolean scuderiaEsiste = false;
            Scanner s = new Scanner(new File(FILE_SCUDERIE));
            while (s.hasNextLine()) {
                String riga = s.nextLine();
                String[] parti = riga.split(";");
                if (parti[0].equalsIgnoreCase(codS)) {
                    scuderiaEsiste = true;
                }
            }
            s.close();

            if (scuderiaEsiste) {
                PrintWriter pw = new PrintWriter(new FileOutputStream(FILE_PILOTI, true));
                System.out.println("Codice pilota: ");
                String codP = tas.nextLine();
                validaCodicePilota(codP);

                System.out.println("Nome: ");
                String nome = tas.nextLine();
                System.out.println("Cognome: ");
                String cognome = tas.nextLine();
                System.out.println("Età: ");
                int eta = tas.nextInt();
                tas.nextLine();

                Pilota p = new Pilota(codP, nome, cognome, eta, codS);
                pw.println(p.toString());
                pw.close();
                System.out.println("Pilota aggiunto con successo");
            } else {
                System.out.println("Errore: La scuderia " + codS + " non esiste.");
            }
        } catch (PilotaGiaPresenteException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Errore: File non trovato.");
        }
    }

    public static void contaPiloti() {
        System.out.println("Inserisci il NOME della scuderia: ");
        String nomeCercato = tas.nextLine();

        try {
            String codiceTrovato = null;
            Scanner sScu = new Scanner(new File(FILE_SCUDERIE));

            while (sScu.hasNextLine()) {
                String riga = sScu.nextLine();
                String[] parti = riga.split(";");
                if (parti[1].equalsIgnoreCase(nomeCercato)) {
                    codiceTrovato = parti[0];
                }
            }
            sScu.close();

            if (codiceTrovato != null) {
                int contatore = 0;
                Scanner sPil = new Scanner(new File(FILE_PILOTI));

                while (sPil.hasNextLine()) {
                    String riga = sPil.nextLine();
                    String[] parti = riga.split(";");
                    // Il codice scuderia nel file piloti è all'ultima posizione (parti[4])
                    if (parti[4].equalsIgnoreCase(codiceTrovato)) {
                        contatore++;
                    }
                }
                sPil.close();

                System.out.println("La scuderia " + nomeCercato + " ha " + contatore + " piloti.");
            } else {
                // Se il codiceTrovato è rimasto null
                System.out.println("Errore: La scuderia '" + nomeCercato + "' non esiste.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Errore: Uno dei file non è stato trovato.");
        } catch (IOException e) {
            System.out.println("Errore di lettura.");
        }
    }

}
