import java.util.*;

public class Demo {
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

    public static void visualizzaDati() {
        for(Double n : numList){
            System.out.print(n + ", ");
        }
    }

    public static int ricercaDato(double numero) {
        return numList.indexOf(numero);
    }

    public static void modificaDato(double numero) {
        int index = ricercaDato(numero);

        if(index != -1) {
            System.out.println("Inserisci numero modificato: ");
            double modificato = tas.nextDouble();
            numList.set(index, modificato);
            System.out.println("numero modificato");
        } else {
            System.out.println("Errore! Numero non presente nell'ArrayList");
        }
    }

    public static void eliminaDato(double numero) {
        int index = ricercaDato(numero);
        if(index != -1) {
            numList.remove(index);
            System.out.println("Numero eliminato");
        } else {
            System.out.println("Errore! Numero non presente nell'ArrayList");
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
                    inserisciDati();
                    break;
                case 2:
                    visualizzaDati();
                    break;
                case 3:
                    System.out.println("Inserisci numero da cercare: ");
                    double numero = tas.nextDouble();
                    int index = ricercaDato(numero);
                    if(index != -1) {
                        System.out.println("Numero presente all'indice " + index);
                    } else {
                        System.out.println("Numero non presente nell'ArrayList");
                    }
                    break;
                case 4:
                    System.out.println("Inserisci numero da cercare: ");
                    numero = tas.nextDouble();
                    modificaDato(numero);
                    break;
                case 5:
                    System.out.println("Inserisci numero da eliminare: ");
                    numero = tas.nextDouble();
                    eliminaDato(numero);
                    break;
                case 6:
                    // Metodo per ordinare gli array in modo crescente
                    Collections.sort(numList, Comparator.comparing(Double::doubleValue));
                    // Decrescente
                    // Collections.sort(numList, Collections.reverseOrder(Comparator.comparing(Double::doubleValue)));
                    visualizzaDati();
                    break;
                case 0:
                    System.out.println("\nProgramma terminato");
                    System.exit(0);
                default:
                    System.out.println("\nScelta non vaida");
            }
        }
    }
}