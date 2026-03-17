import java.util.Scanner;

public class ConversioneOrario {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Inseirsci orario (notazione 24h): ");
                String orario = tas.nextLine();

                if (orario.length() != 5) {
                    throw new FormatoOrarioException("Formato non valido (hh:mm)");
                }
                if (!orario.matches("[0-9]{2}[':']{1}[0-9]{2}")) {
                    throw new FormatoOrarioException("Orario non valido (cifre o :)");
                }

                int ora = Integer.parseInt(orario.substring(0, 2));
                int minuti = Integer.parseInt(orario.substring(3, 5));

                if (ora < 0 || ora > 23 || minuti < 0 || minuti > 59) {
                    throw new FormatoOrarioException("L'orario non esiste");
                }
                String pmam = "AM";
                if (ora > 12) { pmam = "PM"; }
                int ora12 = 12;
                if(ora != 12) { ora12 = ora%12; }
                System.out.println("L'equivalente (notazione 12h): "+ora12+" "+pmam);

            } catch (FormatoOrarioException e) {
                System.out.println("Errore: "+e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Errore!");
            }
            System.out.println("Inserisci n per finire: ");
            String n = tas.next();
            if (n.equalsIgnoreCase("n"));{
                break;
            }
        }
    }
}
