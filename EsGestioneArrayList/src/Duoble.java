import java.util.ArrayList;
import java.util.Scanner;

public class Duoble {
    static Scanner tas = new Scanner(System.in);
    static ArrayList<Double> numList = new ArrayList<>();

    public static void inserisciDati() {
        while(true) {
            System.out.println("Inserisci numero (-1 per uscire): ");
            double num = tas.nextDouble();
            if(num == -1) { break; } else if (numList.contains(num)) {
                System.out.println("Numero già presente");
            } else {
                numList.add(num);
                System.out.println("Numero aggiunto");
            }
        }
    }



    public static void main(String[] args) {
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci dati");
            System.out.println("2. Visualizza dati");
            System.out.println("3. Ricerca un numero");
            System.out.println("4. Modifica un numero");
            System.out.println("5. Rimuovi un numero");
            System.out.println("6. Ordina numeri");
            System.out.println("0. Termina programma");
            System.out.println("Scelta: ");
            int scelta = tas.nextInt();

            switch(scelta) {
                case 1:
                    System.out.println("1");
                case 2:
                    System.out.println("2");
                case 3:
                    System.out.println("3");
                case 4:
                    System.out.println("4");
                case 5:
                    System.out.println("5");
                case 6:
                    System.out.println("6");
                case 0:
                    System.out.println("\nProgramma terminato");
                    System.exit(0);
                default:
                    System.out.println("\nScelta non vaida");
            }
        }
    }
}
