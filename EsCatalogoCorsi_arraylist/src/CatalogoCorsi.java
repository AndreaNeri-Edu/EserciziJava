import java.util.ArrayList;

public class CatalogoCorsi {
    private ArrayList<Corso> corsi = new ArrayList<>();

    public void aggiungiCorso(Corso corso) {
        corsi.add(corso);
    }

    public void mostraCorsi() {
        for(int i=0; i < corsi.size(); i++) {
            System.out.println(corsi.get(i).descrivi());
        }
    }
}