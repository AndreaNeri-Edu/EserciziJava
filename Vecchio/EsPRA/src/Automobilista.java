public class Automobilista extends Persona {
    protected String numeroPatente;
    protected int punti;

    public Automobilista(String nome, String cognome, int annoDiNascita, float peso, float altezza, String numeroPatente, int punti) {
        super(nome, cognome, annoDiNascita, peso, altezza);
        if (ctrlPatente(numeroPatente) == false) {
            System.exit(0);
        } else {
            this.numeroPatente = numeroPatente;
            this.punti = punti;
        }
    }

    public boolean ctrlPatente(String pat) {
        if (pat.length() != 10) return false;

        if (!isLettera(pat.charAt(0)) ||
                !isLettera(pat.charAt(3)) ||
                !isLettera(pat.charAt(9)))
            return false;

        for (int i = 1; i < 10; i++) {
            if (i == 3 || i == 9) continue;
            char c = pat.charAt(i);
            if (c < '0' || c > '9') return false;
        }

        return true;
    }

    private boolean isLettera(char c) {
        return (c >= 'A' &&c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public int getPunti() {
        return punti;
    }

    public void addPunti(int p) {
        punti += p;
        if (punti > 20) punti = 20; // crea un limite
        if (punti < 0) punti = 0;   // crea il limite negativo
    }

    public String getPatente() {
        return numeroPatente;
    }

    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("Numero patente: " + numeroPatente);
        System.out.println("Punti: " + punti);
    }
}
