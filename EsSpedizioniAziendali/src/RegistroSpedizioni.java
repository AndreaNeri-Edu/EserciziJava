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
                System.out.println("----------------------");
            }
        }
    }

    public String veicoloPiuUsato() {
        if (registro.isEmpty()) { System.out.println("Nessuna spedizione registrata"); }
        else {
            
        }
        return "";
    }

}
