public class CorsoOnline extends Corso {
    private String piattaforma;
    private boolean live;

    public CorsoOnline(String nome, String docente, int durataOre, String piattaforma, boolean live) {
        super(nome, docente, durataOre);
        if(piattaforma.equalsIgnoreCase("")) {
            System.out.println("Errore! Piattaforma non valida.");
        }
        this.piattaforma = piattaforma;
        this.live = live;
    }

    public void setPiattaforma(String piattaforma) { this.piattaforma = piattaforma; }
    public void setLive(boolean live) { this.live = live; }

    @Override
    public String descrivi() {
        return "Nome corso: "+nome+"\nDocente: "+docente+"\nDurata: "+durataOre+"\nPiattaforma: "+piattaforma+"\nLive: "+live;
    }
}