public class Atleta {
    private String codiceFiscale;
    private String nome;
    private int eta;
    private String codiceCorso;

    // costruttore base
    public Atleta(String codiceFiscale, String nome, int eta, String codiceCorso) {
        if(codiceFiscale.matches("[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}") && eta > 16) {
            this.codiceFiscale = codiceFiscale;
            this.nome = nome;
            this.eta = eta;
            this.codiceCorso = codiceCorso;
        }
        else { System.exit(0); }
    }

    // set
    public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEta(int eta) { this.eta = eta; }
    public void setCodiceCorso(String codiceCorso) { this.codiceCorso = codiceCorso; }

    // get
    public String getCodiceFiscale() { return codiceFiscale; }
    public String getNome() { return nome; }
    public int getEta() { return eta; }
    public String getCodiceCorso() { return codiceCorso; }

    // toString
    @Override
    public String toString() {
        return codiceFiscale+";"+nome+";"+eta+";"+codiceCorso;
    }

}
