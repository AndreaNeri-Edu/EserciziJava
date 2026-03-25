public class Evento {

    private String titolo;
    private String luogo;
    private String data;

    public Evento(String titolo, String luogo, String data) {
        this.titolo = titolo;
        this.luogo = luogo;
        this.data = data;
    }

    public void setTitolo(String titolo) { this.titolo = titolo; }
    public void setLuogo(String luogo) { this.luogo = luogo; }
    public void setData(String data) { this.data = data; }

    public String getTitolo() { return titolo; }
    public String getLuogo() { return luogo; }
    public String getData() { return data; }

    @Override
    public String toString() {
        return titolo+";"+luogo+";"+data;
    }
}
