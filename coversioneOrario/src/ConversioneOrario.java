import java.util.Scanner;
public class ConversioneOrario {
    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("Inserire un orario nella notazione 24 ore: ");
                String input = tas.nextLine().trim();
                int colonIndex = -1;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ':') {
                        colonIndex = i;
                        break;
                    }
                }

                if (colonIndex != 2) {
                    throw new FormatoOrarioException("Formato non valido, inserisci ':' dopo le ore");
                }
                if (!input.matches("[0-9] {2} [':'] {1} [0-9] {2}")){
                    throw new FormatoOrarioException("cifre invalide");
                }

                int ore = Integer.parseInt(input.substring(0,2));
                int minuti = Integer.parseInt(input.substring(3,5));


                String PMIAM = "PM";
                if (ore<0 || ore>23 || minuti<0 || minuti > 59){
                    throw new FormatoOrarioException("orario non val+
                }
            } catch (FormatoOrarioException exception) {
                System.out.println("errore" + exception.getMessage());

            }

            System.out.println("\nFine del programma.");
        }
    }
}++++