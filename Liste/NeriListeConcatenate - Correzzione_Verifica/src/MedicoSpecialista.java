public class MedicoSpecialista extends Medico {
    private String specializzazione;

    // Costruttore vuoto
    public MedicoSpecialista() {}

    // Costruttore parametrico
    public MedicoSpecialista(String codice, String nome, String cognome, boolean disponibile, String specializzazione) {
        super(codice, nome, cognome, disponibile);
        this.specializzazione = specializzazione;
    }

    // Getter e Setter
    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", Specializzazione: " + specializzazione;
    }
}
