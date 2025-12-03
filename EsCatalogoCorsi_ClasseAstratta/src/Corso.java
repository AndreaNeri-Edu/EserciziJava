public abstract class Corso {
    protected String nome;
    protected String docente;
    protected int durataOre;

    public Corso() {}

    public Corso(String nome, String docente, int durataOre) {
        if(nome.equalsIgnoreCase("") || docente.equalsIgnoreCase("") || durataOre < 0 ) {
            System.out.println("Errore! Attributi non validi.");
            System.exit(0);
        }
        setCorso(nome, docente, durataOre);
    }

    public void setCorso(String nomeNuovo, String docenteNuovo, int durataOreNuovo) {
        this.nome = nomeNuovo;
        this.docente = docenteNuovo;
        this.durataOre = durataOreNuovo;
    }

    public abstract String descrivi();
}
