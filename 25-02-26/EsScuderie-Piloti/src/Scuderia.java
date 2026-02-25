public class Scuderia {
    private String codice_scuderia;
    private String nome;
    private String sede;

    public Scuderia(String codice_scuderia, String nome, String sede){
        this.codice_scuderia = codice_scuderia;
        this.nome = nome;
        this.sede = sede;
    }

    public void setCodice_scuderia(String codice_scuderia) { this.codice_scuderia = codice_scuderia; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSede(String sede) { this.sede = sede; }

    public String getCodice_scuderia() { return codice_scuderia; }
    public String getNome() { return nome; }
    public String getSede() { return sede; }

    @Override
    public String toString(){
        return codice_scuderia+";"+nome+";"+sede;
    }
}