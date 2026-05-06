import java.util.Scanner;

public class GestioneSanitaria {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);
        ListaMedici lista = new ListaMedici();
        boolean disponibile;

        while(true) {
            System.out.println("\nMenu:\n1. Aggiungi medico\n2. Visualizza tutti\n3. Cerca medico");
            System.out.println("4. Rimuovi medico\n5. Visualizza disponibili\n6. Media pazienti");
            System.out.println("7. Conta specialisti\n8. Esci");
            int scelta = tas.nextInt();
            tas.nextLine();

            switch(scelta) {
                case 1:
                    System.out.println("Codice: ");
                    String codice = tas.nextLine();
                    System.out.println("Nome: ");
                    String nome = tas.nextLine();
                    System.out.println("cognome: ");
                    String cognome = tas.nextLine();
                    while(true) {
                        System.out.println("disponibile (t/f): ");
                        String dispo = tas.nextLine();
                        if(dispo.equalsIgnoreCase("t")) {
                            disponibile = true;
                            break;
                        }
                        if(dispo.equalsIgnoreCase("f")) {
                            disponibile = false;
                            break;
                        }
                    }
                    while(true) {
                        System.out.println("Tipo (B/S): ");
                        String tipo = tas.nextLine();
                        if(tipo.equalsIgnoreCase("b")) {
                            System.out.println("Numero assistiti: ");
                            int numeroAssistiti = tas.nextInt();
                            tas.nextLine();
                            MedicoBase medico = new MedicoBase(codice, nome, cognome, disponibile, numeroAssistiti);
                            lista.aggiungiMedicoInCoda(medico);
                            break;
                        }
                        if(tipo.equalsIgnoreCase("s")) {
                            System.out.println("Specializzazione: ");
                            String spe = tas.nextLine();
                            MedicoSpecialista medico = new MedicoSpecialista(codice, nome, cognome, disponibile, spe);
                            lista.aggiungiMedicoInCoda(medico);
                            break;
                        }
                    }
                    break;
                case 2:
                    lista.visualizzaMedici();
                    break;
                case 3:
                    System.out.println("Codice: ");
                    codice = tas.nextLine();
                    Medico medico = lista.cercaMedico(codice);
                    if(medico != null) {
                        System.out.println(medico.toString());
                    } else {
                        System.out.println("Medico non trovato!");
                    }
                    break;
                case 4:
                    System.out.println("Codice: ");
                    codice = tas.nextLine();
                    boolean v = lista.rimuoviMedico(codice);
                    if(v) {
                        System.out.println("Medico Eliminato con successo!");
                    } else {
                        System.out.println("Medico non trovato!");
                    }
                    break;
                case 5:
                    lista.visualizzaMediciDisponibili();
                    break;
                case 6:
                    System.out.println("Media pazienti: "+lista.mediaPazienti());
                    break;
                case 7:
                    System.out.println("Numero medici specialisti: "+lista.contaSpecialisti());
                    break;
                case 8:
                    System.out.println("Programma Terminato");
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida. Riprova!");
            }
        }

    }

}
