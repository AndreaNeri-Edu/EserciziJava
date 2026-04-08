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
<<<<<<< Updated upstream:Vecchio/EsSpedizioniAziendali/src/Veicolo.java
        System.out.print("Targa: ");
        targa = tas.nextLine();
        System.out.print("Marca: ");
        marca = tas.nextLine();
        System.out.print("Codice Identificativo Flotta: ");
        codiceFlotta = tas.nextLine();
        System.out.print("Tipo veicolo: ");
        tipo = tas.nextLine();
        System.out.print("Chilometri percorsi settimanali: ");
=======

        System.out.print("targa: ");
        targa = tas.nextLine();

        System.out.print("marca: ");
        marca = tas.nextLine();

        System.out.print("codice Identificativo Flotta: ");
        codiceFlotta = tas.nextLine();

        System.out.print("tipo veicolo: ");
        tipo = tas.nextLine();

        System.out.print("chilometri percorsi settimanali: ");
>>>>>>> Stashed changes:EsSpedizioniAziendali/src/Veicolo.java
        kmSettimanali = tas.nextDouble();
    }

    @Override
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("targa: " + targa);
        System.out.println("marca: " + marca);
        System.out.println("codice Flotta: " + codiceFlotta);
        System.out.println("tipo: " + tipo);
        System.out.println("km settimanali: " + kmSettimanali);
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