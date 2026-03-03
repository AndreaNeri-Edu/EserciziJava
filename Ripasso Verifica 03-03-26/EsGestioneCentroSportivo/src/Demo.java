import java.util.Scanner;
import java.io.*;

public class Demo {

    static Scanner tas = new Scanner(System.in);
    static final String FILE_CORSI = "corsi.txt";
    static final String FILE_ATLETI = "atleti.txt";

    public static void main(String[] args) {

        while(true) {
            System.out.println("\nMenu");
            System.out.println("1. Aggiungi Corso\n2. Aggiungi atleta\n3. Visualizza atleti\n4. Modifica istruttore\n5. Età media atleti\n6. Esci");
            System.out.println("Scelta: ");

            int scelta = tas.nextInt();
            tas.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiCorso();
                    break;
                case 2:
                    aggiungiAtleta();
                    break;
                case 3:
                    visualizzaAtleti();
                    break;
                case 4:
                    modificaIstruttore();
                    break;
                case 5:
                    calcoloEtaMedia();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Errore: scelta non valida");
            }
        }
    }

    public static void aggiungiCorso() {

    }

}
