import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public static void inserisciRisultato()

public class GestionePartite {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu");
            System.out.println("1. Inserimento risultato");
            System.out.println("2. Visualizzazione risultati");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("9. Termina programma");
            System.out.println("Scelta: ");
            int scelta = tas.nextInt();
            if(scelta == 1) {
                System.out.println(".");
            } else if(scelta == 2) {
                System.out.println(".");
            } else if(scelta == 9) {
                System.out.println("Programma terminato!");
                break;
            } else {
                System.out.println("Scelta non valida!");
            }
        }

    }
}
