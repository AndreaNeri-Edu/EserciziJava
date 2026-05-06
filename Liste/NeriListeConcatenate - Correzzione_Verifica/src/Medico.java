public class Medico {
    private String codice;
    private String nome;
    private String cognome;
    private boolean disponibile;

    // Costruttore vuoto
    public Medico() {}

    // Costruttore parametrico
    public Medico(String codice, String nome, String cognome, boolean disponibile) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.disponibile = disponibile;
    }

    // Getter e Setter
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public boolean getDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    // toString
    @Override
    public String toString() {
        return "Codice: " + codice +
                ", Nome: " + nome +
                ", Cognome: " + cognome +
                ", Disponibile: " + disponibile;
    }
}
