import java.util.Scanner;

public class Veicolo extends AssetAziendale {
    private String targa;
    private String marca;
    private String codiceFlotta;
    private String tipo;
    private double kmSettimanali;

    public Veicolo(String dataAcquisto, String targaNuovo, String marcaNuovo, String codiceFlottaNuovo, String tipoNuovo, double kmSettimanaliNuovo) {
        super(dataAcquisto);
        this.targa = targaNuovo;
        this.marca = marcaNuovo;
        this.codiceFlotta = codiceFlottaNuovo;
        this.tipo = tipoNuovo;
        this.kmSettimanali = kmSettimanaliNuovo;
    }

    @Override
    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        super.leggiInput();
        System.out.print("Targa: ");
        targa = tas.nextLine();
        System.out.print("Marca: ");
        marca = tas.nextLine();
        System.out.print("Codice Identificativo Flotta: ");
        codiceFlotta = tas.nextLine();
        System.out.print("Tipo veicolo: ");
        tipo = tas.nextLine();
        System.out.print("Chilometri percorsi settimanali: ");
        kmSettimanali = tas.nextDouble();
    }

    @Override
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("Targa: " + targa);
        System.out.println("Marca: " + marca);
        System.out.println("Codice Flotta: " + codiceFlotta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Km settimanali: " + kmSettimanali);
    }

    public String getCodiceFlotta() { return codiceFlotta; }
    public String getTipo() { return tipo; }
    public double getKmSettimanali() { return kmSettimanali; }

    @Override
    public boolean equals(Object altro) {
        if(altro instanceof Veicolo) return false;
        else {
            Veicolo v = (Veicolo) altro;
            return this.tipo.equals(v.tipo) &&  this.kmSettimanali == v.kmSettimanali;
        }
    }
}