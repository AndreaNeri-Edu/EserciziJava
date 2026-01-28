import java.util.ArrayList;
public class GestorePolizze {
    private ArrayList<PolizzaAssicurativa> polizze = new ArrayList<>();

    public void aggiungiPolizza(PolizzaAssicurativa p) { polizze.add(p); }

    public PolizzaAssicurativa cercaPolizza(int numeroP) throws PolizzaNonTrovataException {
        for (PolizzaAssicurativa p : polizze) {
            if (p.getNumeroPolizza() == numeroP) {
                return p;
            }
        }
        throw new PolizzaNonTrovataException("Polizza numero "+numeroP+" non trovata"); }

}
