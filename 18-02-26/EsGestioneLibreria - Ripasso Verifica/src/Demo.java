import java.util.Scanner;
import java.io.*;

public class Demo {

    static Scanner tas = new Scanner(System.in);
    static final String FILE_NAME = "libri.txt";

    public static void main(String[] args) {

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci nuovo libro\n2. Visualizza Libri\n3. Cerca libro con ISBN\n4. Modifica disponibilità libro\n5. Calcolo numero medio pagine\n6. Esci");
            System.out.println("Scelta: ");

            int scelta = tas.nextInt();
            tas.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiLibro();
                    break;
                case 2:
                    visualizzaLibri();
                    break;
                case 3:
                    cercaLibro();
                    break;
                case 4:
                    modificaDisponibilita();
                    break;
                case 5:
                    numMedioPagine();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Errore: Scelta non valida");
            }
        }
    }

    public static void validaISBN(String isbn) throws LunghezzaISBNException, FormatoISBNException {
        if (isbn.length() != 13) {
            throw new LunghezzaISBNException("Errore: l'ISBN deve essere da 13 cifre");
        }
        if (!isbn.matches("[0-9]{13}")) {
            throw new FormatoISBNException("Errore: l'ISBN deve contenere solo numeri");
        }
    }

    public static void aggiungiLibro() {
        boolean caricamento = false;
        while(!caricamento) {
            try {
                System.out.println("Titolo: ");
                String titolo = tas.nextLine();
                System.out.println("ISBN: ");
                String isbn = tas.nextLine();
                validaISBN(isbn);

                System.out.println("Numero pagine: ");
                int pagine = tas.nextInt();
                boolean disponibile;
                while(true) {
                    System.out.println("Disponibile (s/n): ");
                    String dispo = tas.nextLine();
                    if("s".equalsIgnoreCase(dispo)) {
                        disponibile = true;
                        break;
                    }
                    if (dispo.equalsIgnoreCase("n")) {
                        disponibile = false;
                        break;
                    }
                }

                Libro libro = new Libro(isbn, titolo, pagine, disponibile);

                PrintWriter pw = new PrintWriter(new FileOutputStream(FILE_NAME, true));
                pw.println(libro.toString());
                pw.close();

                System.out.println("Libro aggiunto con successo");
                caricamento = true;
            }catch(LunghezzaISBNException | FormatoISBNException e) {
                System.out.println(e.getMessage());
            }catch (FileNotFoundException e) {
                System.out.println("Errore: file non trovato");
            }
        }
    }

    public static void visualizzaLibri() {
        try(Scanner fileReader = new Scanner(new FileInputStream(FILE_NAME));) {
            while(fileReader.hasNextLine()) {
                String riga = fileReader.nextLine();
                String[] parti = riga.split(";");
                if(parti.length == 4) {
                    System.out.println("-------------------");
                    System.out.println("\nISBN: "+parti[0]+"\nTitolo: "+parti[1]+"\nPagine: "+parti[2]+"Disponibile: "+parti[3]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato prova prima a inserire un libro");
        }
    }

    public static void cercaLibro() {
        boolean trovato = false;
        System.out.println("ISBN: ");
        String isbn = tas.nextLine();
        try {
            validaISBN(isbn);
            try(Scanner fileReader = new Scanner(new FileInputStream(FILE_NAME));) {
                while(fileReader.hasNextLine()) {
                    String riga = fileReader.nextLine();
                    String[] parti = riga.split(";");
                    if(parti[0].equalsIgnoreCase(isbn)) {
                        System.out.println("\nISBN: "+parti[0]+"\nTitolo: "+parti[1]+"\nPagine: "+parti[2]+"Disponibile: "+parti[3]);
                        trovato = true;
                        break;
                    }
                }
                if(!trovato){ System.out.println("Libro non trovato"); }
            }
        }catch (LunghezzaISBNException | FormatoISBNException e) {
            System.out.println(e.getMessage());
        }catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato");
        }
    }

    public static void modificaDisponibilita() {
        boolean disponibile;
        System.out.println("ISBN: ");
        String isbn = tas.nextLine();
        try {
            validaISBN(isbn);
            File originale = new File(FILE_NAME);
            File temp = new File("temp.txt");
            try(Scanner fileReader = new Scanner(originale);) {
                while(fileReader.hasNextLine()) {
                    String riga = fileReader.nextLine();
                    String[] parti = riga.split(";");
                    if(parti[0].equalsIgnoreCase(isbn)) {
                        System.out.println("Disponibilità attuale: "+parti[3]);
                        while(true) {
                            System.out.println("Nuovo stato (t/f): ");
                            String nuovoStato = tas.nextLine();
                            if(nuovoStato.equalsIgnoreCase("t")) {
                                disponibile = true;
                                break;
                            }
                            if (nuovoStato.equalsIgnoreCase("f")) {
                                disponibile = false;
                                break;
                            }
                        }
                    }
                }

            }
        }catch (LunghezzaISBNException | FormatoISBNException e) {
            System.out.println(e.getMessage());
        }catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato");
        }
    }

    public static void numMedioPagine() {
        int numLibri = 0;
        int somma  = 0;
        double media = 0;
        try(Scanner fileReader = new Scanner(new FileInputStream(FILE_NAME));) {
            while(fileReader.hasNextLine()) {
                String riga = fileReader.nextLine();
                String[] parti = riga.split(";");
                somma+= Integer.parseInt(parti[2]);
                numLibri+=1;
            }

            if(numLibri == 0) {
                System.out.println("Errore: non sono presenti libri");
                return;
            } else {
                media= (double) somma/numLibri;
            }

            while(fileReader.hasNextLine()) {
                String riga = fileReader.nextLine();
                String[] parti = riga.split(";");
                int pag = Integer.parseInt(parti[2]);
                System.out.println("Libro"+parti[1]+": ");
                if(pag > media) { System.out.println("Libro "+parti[1]+" superiore alla media"); }
                else if(pag < media) { System.out.println("Libro "+parti[1]+" inferiore alla media"); }
                else { System.out.println("Libro "+parti[1]+" uguale alla media"); }
            }
        }catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato");
        }
    }

}
