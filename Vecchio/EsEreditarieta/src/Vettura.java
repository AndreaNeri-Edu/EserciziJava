import java.util.Scanner;

public class Vettura extends Veicolo{
    private String tipologia;

    public Vettura(String targa, String marca, String modello, String tipologia, int annoImmatricolazione) {
        super(targa, marca, modello, annoImmatricolazione);
        this.tipologia = tipologia;
    }

    public void setTipologia(String tipologia) { this.tipologia = tipologia; }
    public String getTipologia() { return tipologia; }

    @Override
    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        super.leggiInput();
        System.out.println("Inserisci la tipologia: ");
        this.tipologia = tas.next();
    }

    @Override
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("tipologia: "+tipologia);
    }

}
