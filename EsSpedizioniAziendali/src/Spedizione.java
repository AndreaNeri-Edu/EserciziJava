public class Spedizione {
    private Veicolo veicoloAssegnato;
    private String codiceSpedizione;
    private double caricoNetto;
    private String dataPartenza;

    public Spedizione(Veicolo veicoloAssegnatoNuovo, String codiceSpedizioneNuovo, double caricoNettoNuovo, String dataPartenzaNuovo) {
        this.veicoloAssegnato = veicoloAssegnatoNuovo;
        this.codiceSpedizione = codiceSpedizioneNuovo;
        this.caricoNetto = caricoNettoNuovo;
        this.dataPartenza = dataPartenzaNuovo;
    }

    public void setVeicoloAssegnato(Veicolo veicolo) { this.veicoloAssegnato = veicolo; }
    public void setCodiceSpedizione(String codice) { this.codiceSpedizione = codice; }
    public void setCaricoNetto(double carico) { this.caricoNetto = carico; }
    public void setDataPartenza(String data) { this.dataPartenza = data; }

    public Veicolo getVeicoloAssegnato() { return veicoloAssegnato; }
    public String getCodiceSpedizione() { return codiceSpedizione; }
    public double getCaricoNetto() { return caricoNetto; }
    public String getDataPartenza() { return dataPartenza; }


    public void scriviOutput() {
        System.out.println("Codice spedizione: " + codiceSpedizione);
        System.out.println("Carico netto: " + caricoNetto + " kg");
        System.out.println("Data partenza: " + dataPartenza);
        System.out.println("Veicolo assegnato:");
        veicoloAssegnato.scriviOutput();
    }

    public boolean equals(Spedizione altra) {
        return this.codiceSpedizione.equals(altra.codiceSpedizione) &&
                this.caricoNetto == altra.caricoNetto;
    }
}