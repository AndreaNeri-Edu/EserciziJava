import java.util.Scanner;

public class Veicolo extends AssetAziendale {
    private String targa;
    private String marca;
    private String codiceFlotta;
    private String tipo;
    private double kmSettimanali;

    public Veicolo(String dataAcquisto, String targa, String marca, String codiceFlotta, String tipo, double kmSettimanali) {
        super(dataAcquisto);
        this.targa = targa;
        this.marca = marca;
        this.codiceFlotta = codiceFlotta;
        this.tipo = tipo;
        this.kmSettimanali = kmSettimanali;
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

    public String getcodiceFlotta() { return codiceFlotta; }
    public String getTipo() { return tipo; }
    public double getkmSettimanali() { return kmSettimanali; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Veicolo)) return false;
        Veicolo v = (Veicolo) obj;
        return this.tipo.equals(v.tipo) &&
                this.kmSettimanali == v.kmSettimanali;
    }
}