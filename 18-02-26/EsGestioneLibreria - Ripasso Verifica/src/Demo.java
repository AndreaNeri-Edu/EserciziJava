import java.util.Scanner;
import java.io.*;

public class Demo {

    static Scanner tas = new Scanner(System.in);
    static PrintWriter fw;
    static final String FILE_NAME = "libri.txt";

    public static void main(String[] args) {

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci nuovo libro" +
                    "\n2. Visualizza Libri" +
                    "\n3. Cerca libro con ISBN" +
                    "\n4. Modifica disponibilità libro" +
                    "\n5. Calcolo numero medio pagine" +
                    "\n6. Esci");
            int scelta = tas.nextInt();
            switch (scelta) {
                case 1:
                    boolean caricamentoLibro = false;
                    Libro temp = null;

                    while(!caricamentoLibro){
                        caricamentoLibro = true;
                        try{
                            temp = aggiungiLibro();
                        }
                        catch (LunghezzaISBNException | FormatoISBNException e){
                            System.out.println(e.getMessage());
                            caricamentoLibro = false;
                        }
                    }
                    fw.println(temp.toString());
                    fw.close();
                    break;
                case 2:

                case 3:

                case 4:

                case 5:

                default:
                    System.out.println("Errore: Scelta non valida");
                    System.exit(0);
            }
        }
    }

    public static Libro aggiungiLibro() {
        System.out.println("Inserisci titolo: ");
        String titolo = tas.next();
        System.out.println("Inserisci ISBN: ");
        String isbn = tas.next();
        System.out.println("Inserisci numero di pagine: ");
        int numPagine = tas.nextInt();
        System.out.println("Libro disponibile (s/n): ");
        String sn =  tas.next();
        boolean disponibile;
        if(sn.equalsIgnoreCase("s")){ disponibile = true; }
        else{ disponibile = false; }
        return new Libro(titolo, isbn, numPagine, disponibile);
    }

}
