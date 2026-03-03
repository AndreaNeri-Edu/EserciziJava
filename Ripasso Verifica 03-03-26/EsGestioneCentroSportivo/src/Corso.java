public class Corso {
    private String codiceCorso;
    private String nomeCorso;
    private String istruttore;

    // costruttore base
    public Corso(String codiceCorso, String nomeCorso, String istruttore) {
        this.codiceCorso = codiceCorso;
        this.nomeCorso = nomeCorso;
        this.istruttore = istruttore;
    }

    // set
    public void setCodiceCorso(String codiceCorso) { this.codiceCorso = codiceCorso; }
    public void setNomeCorso(String nomeCorso) { this.nomeCorso = nomeCorso; }
    public void setIstruttore(String istruttore) { this.istruttore = istruttore; }

    // get
    public String getCodiceCorso() { return codiceCorso; }
    public String getNomeCorso() { return nomeCorso; }
    public String getIstruttore() { return istruttore; }

    // toString
    @Override
    public String toString(){
        return codiceCorso+";"+nomeCorso+";"+istruttore;
    }

}
