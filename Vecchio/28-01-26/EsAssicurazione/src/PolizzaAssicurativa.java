public class PolizzaAssicurativa {
    private int numeroPolizza;
    private String titolare;
    private double massimale;
    private boolean stato;

    public PolizzaAssicurativa (int numeroPolizza, String titolare, double massimale, boolean stato) {
        this.numeroPolizza = numeroPolizza;
        this.titolare = titolare;
        this.massimale = massimale;
        this.stato = true;
    }

    public int getNumeroPolizza() {
        return numeroPolizza;
    }

    public void setNumeroPolizza(int numeroPolizza) {
        this.numeroPolizza = numeroPolizza;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public double getMassimale() {
        return massimale;
    }

    public void setMassimale(double massimale) {
        this.massimale = massimale;
    }

    public boolean getStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public void richiediRisarcimento(double importo) throws RisarcimentoNegatoException {
        if (!stato) {
            throw new RisarcimentoNegatoException("La polizza è disattivata");
        }
        if (importo > massimale) {
            throw new RisarcimentoNegatoException("L'importo supera il massimale");
        }
        System.out.println("Risarcimento approvato: " + importo + "€");
    }


}
