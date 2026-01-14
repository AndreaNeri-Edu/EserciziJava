import java.util.ArrayList;

public class RegistroSpedizioni {
    private ArrayList<Spedizione> registro;

    public RegistroSpedizioni() { registro = new ArrayList<>(); }

    public void registraSpedizione(Spedizione spedi) { registro.add(spedi); }

    public void visualizzaSpedizioni() {
        if (registro.isEmpty()) { System.out.println("Nessuna spedizione registrata"); }
        else {
            for (Spedizione spedi : registro) {
                spedi.scriviOutput();
                System.out.println(" ");
            }
        }
    }

    public String veicoloPiuUsato() {
        if (registro.isEmpty()) { return "Nessuna spedizione registrata"; }
        else {
            String codiceMax = "";
            double maxKm = -1;
            for (Spedizione spedi : registro) {
                Veicolo veicolo = spedi.getVeicoloAssegnato();
                if (veicolo.getKmSettimanali() > maxKm) {
                    maxKm = veicolo.getKmSettimanali();
                    codiceMax = veicolo.getCodiceFlotta();
                }
            } return codiceMax;
        }
    }

    public double caricoMedioTotale() {
        if (registro.isEmpty()) { System.out.println("Nessuna spedizione registrata"); return -1; }
        double somma = 0;
        for (Spedizione s : registro) {
            somma += s.getCaricoNetto();
        } return somma / registro.size();
    }
}
