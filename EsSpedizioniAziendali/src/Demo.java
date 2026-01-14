import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);
        RegistroSpedizioni registro = new RegistroSpedizioni();
        int scelta;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Registra spedizione");
            System.out.println("2. Visualizza spedizioni");
            System.out.println("3. Veicolo più usato");
            System.out.println("4. Carico medio totale");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = tas.nextInt();
            tas.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci dati veicolo:");
                    Veicolo veicolo = new Veicolo("", "", "", "", "", 0);
                    veicolo.leggiInput();

                    System.out.println("Inserisci dati spedizione:");
                    Spedizione spedi = new Spedizione(veicolo, "", 0, "");
                    spedi.leggiInput();

                    registro.registraSpedizione(spedi);
                    System.out.println("Spedizione registrata con successo!");
                    break;

                case 2:
                    registro.visualizzaSpedizioni();
                    break;

                case 3:
                    System.out.println("Veicolo più usato: " + registro.veicoloPiuUsato());
                    break;

                case 4:
                    System.out.println("Carico medio totale: " + registro.caricoMedioTotale() + " kg");
                    break;
            }

        } while (scelta != 0);

        System.out.println("Programma terminato.");
    }
}
