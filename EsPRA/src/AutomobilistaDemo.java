import java.util.Scanner;

public class AutomobilistaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("qunati automobilisti vuoi inserire? ");
        int N = sc.nextInt();
        sc.nextLine();
        Automobilista[] pra = new Automobilista[N];

        for (int i = 0; i < N; i++) {
            System.out.println("automobilistica: " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Cognome: ");
            String cognome = sc.nextLine();
            System.out.print("Anno di nascita: ");
            int anno = sc.nextInt();
            System.out.print("Peso: ");
            float peso = sc.nextFloat();
            System.out.print("Altezza: ");
            float altezza = sc.nextFloat();
            sc.nextLine();
            System.out.print("Numero patente (10 caratteri): ");
            String patente = sc.nextLine();
            System.out.print("Punti iniziali (max 20): ");
            int punti = sc.nextInt();
            sc.nextLine();

            pra[i] = new Automobilista(nome, cognome, anno, peso, altezza, patente, punti);
        }

        int scelta = 0;
        while (true) {
            System.out.println("1. Visualizza punti patente di un automobilista");
            System.out.println("2. Attribuzione di una sanzione");
            System.out.println("3. Elenco automobilisti con punti inferiori a X");
            System.out.println("4. Esci");
            System.out.print("Inserisci la tua scelta: ");
            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il numero di patente: ");
                    String pat1 = sc.nextLine();
                    int pos1 = ricerca(pat1, pra);
                    if (pos1 != -1) {
                        System.out.println("Punti patente: " + pra[pos1].getPunti());
                    } else {
                        System.out.println("Automobilista non trovato.");
                    }
                    break;

                case 2:
                    System.out.print("Inserisci il numero di patente: ");
                    String pat2 = sc.nextLine();
                    int pos2 = ricerca(pat2, pra);
                    if (pos2 != -1) {
                        System.out.print("Quanti punti vuoi sottrarre? ");
                        int puntiDaSottrarre = sc.nextInt();
                        pra[pos2].addPunti(-puntiDaSottrarre);
                        System.out.println("Nuovi punti: " + pra[pos2].getPunti());
                    } else {
                        System.out.println("Automobilista non trovato.");
                    }
                    break;

                case 3:
                    System.out.print("Inserisci la soglia X: ");
                    int x = sc.nextInt();
                    System.out.println("Automobilisti con punti inferiori a " + x + ":");
                    for (Automobilista a : pra) {
                        if (a.getPunti() < x) {
                            a.scriviOutput();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Uscita dal programma.");
                    sc.close();
                    return;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    public static int ricerca(String patente, Automobilista vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getPatente().equalsIgnoreCase(patente)) {
                return i;
            }
        }
        return -1;
    }
}
