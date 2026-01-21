import java.util.Scanner;

public class AgendaStudenti {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);
        String[] appuntamenti = new String[6];
        int appInseriti=0;

        while (appInseriti<6) {
            try {
                System.out.print("Inserisci un'ora (13-18): ");
                int ora = tas.nextInt();

                if (ora < 13 || ora > 18) {
                    throw new OraNonContemplataException("Ora non valida: "+ora);
                }
                int indice = ora-13;
                if (appuntamenti[indice] != null) {
                    throw new OraOccupataException("L'ora "+ ora +" è già occupata.");
                }

                System.out.print("Descrizione dell'appuntamento: ");
                tas.nextLine();
                String descrizione = tas.nextLine();

                appuntamenti[indice] = descrizione;
                appInseriti++;
                System.out.println("Appuntamento inserito correttamente!");

            } catch (OraNonContemplataException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (OraOccupataException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
        tas.close();

        System.out.println("Tabella appuntamenti:");
        for (int i=0; i<appuntamenti.length; i++) {
            System.out.println((13 + i)+": "+appuntamenti[i]);
        }
    }
}
