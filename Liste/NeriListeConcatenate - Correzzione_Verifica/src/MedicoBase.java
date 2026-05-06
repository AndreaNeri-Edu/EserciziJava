public class MedicoBase extends Medico {
    private int numeroAssistiti;

    // Costruttore vuoto
    public MedicoBase() {}

    // Costruttore parametrico
    public MedicoBase(String codice, String nome, String cognome, boolean disponibile, int numeroAssistiti) {
        super(codice, nome, cognome, disponibile);
        this.numeroAssistiti = numeroAssistiti;
    }

    // Getter e Setter
    public int getNumeroAssistiti() {
        return numeroAssistiti;
    }

    public void setNumeroAssistiti(int numeroAssistiti) {
        this.numeroAssistiti = numeroAssistiti;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", Numero Assistiti: " + numeroAssistiti;
    }
}
