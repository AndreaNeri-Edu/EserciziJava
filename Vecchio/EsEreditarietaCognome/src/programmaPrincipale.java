import java.util.Scanner;

public class programmaPrincipale {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);
        System.out.println("Inserisci numero massimo archivio: ");
        int max = tas.nextInt();
        Acquisti archivio =  new Acquisti(max);

        while(true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Inserimento Acquisto");
            System.out.println("2. visualizza Acquisti");
            System.out.println("3. Acquisto Minore");
            System.out.println("4. Importo medio Acquisti");
            System.out.println("0. Esci");
            System.out.println(" ");
            System.out.println("Numero comando: ");
            int scelta = tas.nextInt();

            if(scelta==1) {
                Acquisto nuovo = new Acquisto();
                nuovo.leggiInput();
                archivio.inserimetoAcquisto(nuovo);
            } else if (scelta==2) {
                archivio.visualizzaAcquisti();
            } else if (scelta==3) {
                archivio.acquistoMinore();
            } else if (scelta==4) {
                archivio.ValoreMedioAcquisti();
            } else if (scelta==0) {
                System.exit(0);
            } else {
                System.out.println("Errore! Comando non valido.");
            }
        }

    }
}
