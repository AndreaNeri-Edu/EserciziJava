public class Pilota{
    private String codice_pilota;
    private String nome, cognome;
    private int eta;
    private String codice_scuderia;

    public Pilota(String codice_pilota, String nome, String cognome, int eta, String codice_scuderia) {
        this.codice_pilota = codice_pilota;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codice_scuderia = codice_scuderia;
    }

    public void setCodice_pilota(String codice_pilota) { this.codice_pilota = codice_pilota; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setEta(int eta) { this.eta = eta; }
    public void setCodice_scuderia(String codice_scuderia) { this.codice_scuderia = codice_scuderia; }

    public String getCodice_pilota() { return codice_pilota; }
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getEta() { return eta; }
    public String getCodice_scuderia() { return codice_scuderia; }

    @Override
    public String toString(){
        return codice_pilota+";"+nome+";"+cognome+";"+eta+";"+codice_scuderia;
    }
}
