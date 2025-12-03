import java.util.Scanner;

public class Acquisto {
    private Acquirente acquirente;
    private String dataAcquisto;
    private Double importo;

    public Acquisto() {
        this.acquirente = new Acquirente();
        this.dataAcquisto = "";
        this.importo = 0.0;
    }
    public Acquisto(Acquirente acquirente, String dataAcquisto, Double importo) {
        setAcquisto(acquirente, dataAcquisto, importo);
    }

    public void setAcquisto(Acquirente acquirenteNuovo, String dataAcquistoNuovo, Double importoNuovo) {
        this.acquirente = acquirenteNuovo;
        this.dataAcquisto = dataAcquistoNuovo;
        this.importo = importoNuovo;
    }

    public void setAcquirente(Acquirente acquirente) { this.acquirente = acquirente; }
    public void setDataAcquisto(String dataAcquisto) { this.dataAcquisto = dataAcquisto; }
    public void setImporto(Double importo) { this.importo = importo; }

    public Acquirente getAcquirente() { return acquirente; }
    public String getDataAcquisto() { return dataAcquisto; }
    public Double getImporto() { return importo; }

    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        System.out.println("--- Acquirente ---");
        acquirente.leggiInput();
        System.out.println("--- Dati Acquisto ---");
        System.out.println("Inserisci data dell'acquisto (gg/mm/aaaa): ");
        this.dataAcquisto = tas.next();
        System.out.println("Inserisci importo: ");
        this.importo = tas.nextDouble();
    }

    public void scriviOutput() {
        System.out.println("--- Dettagli Acquisto ---");
        acquirente.scriviOutput();
        System.out.println("Data Acquisto: "+dataAcquisto);
        System.out.println("Importo: "+importo);
    }

    public boolean equals (Acquisto altro) {
        if(altro == null) { return false; }
        else {
            return (this.dataAcquisto.equals(altro.dataAcquisto)) && (this.importo == altro.importo);
        }
    }

}
