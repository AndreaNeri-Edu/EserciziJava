import java.util.Scanner;

public class Motociclo extends Veicolo{
    private int cilindrata;

    public Motociclo(String targa, String marca, String modello, int cilindrata , int annoImmatricolazione) {
        super(targa, marca, modello, annoImmatricolazione);
        this.cilindrata = cilindrata;
    }

    public void setCilindrata(int cilindrata) { this.cilindrata = cilindrata; }
    public int getCilindrata() { return cilindrata; }

    @Override
    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        super.leggiInput();
        System.out.println("Inserisci la tipologia: ");
        this.cilindrata = tas.nextInt();
    }

    @Override
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("Cilindrata: "+cilindrata);
    }
}
