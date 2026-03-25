public class Conferenza extends Evento {

    private String relatore;

    public Conferenza(String titolo, String luogo, String data, String relatore) {
        super(titolo, luogo, data);
        this.relatore = relatore;
    }

    public void setRelatore(String relatore) { this.relatore = relatore; }
    public String getRelatore() { return relatore; }

    @Override
    public String toString() {
        return super.toString()+";"+relatore;
    }

}
