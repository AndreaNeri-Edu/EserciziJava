import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoCorsi {
    private ArrayList<Corso> corsi = new ArrayList<>();

    public void aggiungiCorso(Corso corso) {
        corsi.add(corso);
    }

    public void mostraCorsi() {
        System.out.println("--- Elenco Corsi ---");
        for(int i=0; i < corsi.size(); i++) {
            System.out.println("Corso "+(i+1));
            System.out.println(corsi.get(i).descrivi());
            System.out.println("----------");
        }
    }

    /* public void modificaCorso(int indice) {
        if(indice < 0 || indice >= corsi.size()) {
            System.out.println("Errore. Indice non valido.");
            System.exit(0);
        }
        Scanner tas = new Scanner(System.in);
        Corso corso = corsi.get(indice);
        System.out.println("--- Modifica Corso ---");
        System.out.println("Nome (lascia vuoto per non cambiare): ");
        String nome = tas.next();
        if(nome.isEmpty()) { corso.setNome(nome); }
        System.out.println("Docente (lascia vuoto per non cambiare): ");
        String docente = tas.next();
        if(docente.isEmpty()) { corso.setDocente(docente); }
        System.out.print("Nuova durata (0 per non cambiare): ");
        int durata = tas.nextInt();
        if(durata > 0) { corso.setDurataOre(durata); }

    } */
}