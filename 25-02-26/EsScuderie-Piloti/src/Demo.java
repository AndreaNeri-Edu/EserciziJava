import java.util.Scanner;
import java.io.*;

public class Demo {

    static Scanner tas = new Scanner(System.in);
    static final String FILE_PILOTI = "piloti.txt";
    static final String FILE_SCUDERIE = "scuderie.txt";

    public static void main(String[] args) {
        while(true) {
            System.out.println("\nMenu");
            System.out.println("1.Aggiungi scuderia\n2.Aggiugi pilota\n3.Calcolo piloti di una scuderia\n4.facoltativo");


            int scelta = tas.nextInt();
            tas.nextLine();

            switch (scelta) {
                case 1:
                    break;
                case 2:
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

    public static void aggiungiScuderia() {
        System.out.println("Codice scuderia: ");
        String cod = tas.nextLine();
        System.out.println("Nome scuderia: ");
        String nome = tas.nextLine();
        System.out.println("Sede: ");
        String sede = tas.nextLine();

        Scuderia s = new Scuderia(cod, nome, sede);
    }

}
