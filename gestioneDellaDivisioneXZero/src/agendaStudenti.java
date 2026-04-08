import java.util.Scanner;

class AgendaStudenti {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] appuntamenti = new String[6];

        int inseriti = 0;

        while (inseriti < 6) {
            try {
                System.out.print("Inserisci un'ora (13-18): ");
                int ora = input.nextInt();
                input.nextLine();

                if (ora < 13 || ora > 18) {
                    throw new OraNonContemplataException("Ora non valida: " + ora);
                }

                int indice = ora - 13;
                if (appuntamenti[indice] != null) {
                    throw new OraOccupataException("L'ora " + ora + " è già occupata.");
                }

                System.out.print("Inserisci la descrizione dell'appuntamento: ");
                String descrizione = input.nextLine();

                appuntamenti[indice] = descrizione;
                inseriti++;

                System.out.println("Appuntamento inserito correttamente!\n");

            } catch (OraNonContemplataException e) {
                System.out.println("Errore: " + e.getMessage() + "\n");
            } catch (OraOccupataException e) {
                System.out.println("Errore: " + e.getMessage() + "\n");
            }
        }

        input.close();

        // Stampa finale degli appuntamenti
        System.out.println("\nTutti gli appuntamenti sono stati inseriti:");
        for (int i = 0; i < appuntamenti.length; i++) {
            System.out.println((13 + i) + ": " + appuntamenti[i]);
        }
    }
}