public class Risultato {

    private String squadraCasa;
    private String squadraFuori;
    private int golCasa;
    private int golFuori;

    public Risultato(String squadraCasa, String squadraFuori, int golCasa, int golFuori) {
        this.squadraCasa = squadraCasa;
        this.squadraFuori = squadraFuori;
        this.golCasa = golCasa;
        this.golFuori = golFuori;
    }

    public void setSquadraCasa(String squadraCasa) { this.squadraCasa = squadraCasa; }
    public void setSquadraFuori(String squadraFuori) { this.squadraFuori = squadraFuori; }
    public void setGolCasa(int golCasa) { this.golCasa = golCasa; }
    public void setGolFuori(int golFuori) { this.golFuori = golFuori; }

    public String getSquadraCasa() { return squadraCasa; }
    public String getSquadraFuori() { return squadraFuori; }
    public int getGolCasa() { return golCasa; }
    public int getGolFuori() { return golFuori; }

    @Override
    public String toString() {
        return "\n"+squadraCasa+" vs "+squadraFuori+" "+golCasa+" - "+golFuori;
    }

    public int puntiCasa() {
        if(golCasa>golFuori) return 3;
        if(golCasa==golFuori) return 1;
        return 0;
    }

    public int puntiFuori() {
        
    }
}
