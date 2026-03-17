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
}