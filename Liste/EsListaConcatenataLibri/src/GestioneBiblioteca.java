import java.util.Scanner;

public class GestioneBiblioteca {
    public static void main(String[] args) {
        ListaLibri lista = new ListaLibri();
        Scanner tas = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu:\n1. Aggiungi libro\n2. Visualizza tutti i libri\n3. Cerca un libro (isbn)\n4. Rimuovi libro");
            System.out.println("5. Visualizza libri disponibili\n6. Conta libri totali\n7. Conta libri narrativi\n8. Esci");
            int scelta = tas.nextInt();
            tas.nextLine();
            boolean disponibile;

            switch (scelta) {
                case 1:
                    System.out.println("ISBN: ");
                    String isbn = tas.nextLine();
                    System.out.println("Titolo: ");
                    String titolo = tas.nextLine();
                    System.out.println("Autore: ");
                    String autore = tas.nextLine();
                    System.out.println("Pagine: ");
                    int pagine = tas.nextInt();
                    tas.nextLine();
                    while(true) {
                        System.out.println("Disponibile (t/f): ");
                        String dispo = tas.nextLine();
                        if(dispo.equalsIgnoreCase("t")) {
                            disponibile = true;
                            break;
                        }if(dispo.equalsIgnoreCase("f")) {
                            disponibile = false;
                            break;
                        }
                    }
                    while(true) {
                        System.out.println("Tipo (N/S): ");
                        String tipo = tas.nextLine();
                        if(tipo.equalsIgnoreCase("n")) {
                            System.out.print("Genere: ");
                            String genere = tas.nextLine();
                            lista.aggiungiLibroInCoda(new LibroNarrativa(titolo, isbn, autore, pagine, disponibile, genere));
                            break;
                        }
                        if(tipo.equalsIgnoreCase("s")) {
                            System.out.print("Argomento: ");
                            String argomento = tas.nextLine();
                            lista.aggiungiLibroInCoda(new LibroSaggistica(titolo, isbn, autore, pagine, disponibile, argomento));
                            break;
                        }
                    }
                    break;
                case 2:
                    lista.visualizzaLibri();
                    break;
                case 3:
                    System.out.println("ISBN: ");
                    isbn = tas.nextLine();
                    Libro libro = lista.cercaLibro(isbn);
                    if(libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("Libro non trovato");
                    }
                    break;
                case 4:
                    System.out.println("ISBN: ");
                    isbn = tas.nextLine();
                    boolean rimosso = lista.rimuoviLibro(isbn);
                    if(rimosso) {
                        System.out.println("Libro rimosso!");
                    } else {
                        System.out.println("Libro non trovato");
                    }
                    break;
                case 5:
                    lista.visualizzaLibriDisponibili();
                    break;
                case 6:
                    System.out.println("Totale libri: "+lista.contaLibri());
                    break;
                case 7:
                    System.out.println("Totale libri narrativi: "+lista.contaLibriNarrativa());
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Errore: Scelta non valida");
            }
        }

    }
}
