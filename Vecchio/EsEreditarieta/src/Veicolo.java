import java.util.Scanner;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int annoImmatricolazione;

    public Veicolo() {
        this.targa = null;
        this.marca = null;
        this.modello = null;
        this.annoImmatricolazione = 0;
    }

    public Veicolo(String targa, String marca, String modello, int annoImmatricolazione) {
        setVeicolo(targa, marca, modello, annoImmatricolazione);
    }

    public void setVeicolo(String targaNuova, String marcaNuova, String modelloNuovo, int annoImmatricolazioneNuovo) {
        this.targa = targaNuova;
        this.marca = marcaNuova;
        this.modello = modelloNuovo;
        this.annoImmatricolazione = annoImmatricolazioneNuovo;
    }

    public void setTarga(String targaNuova) { setVeicolo(targaNuova, marca, modello, annoImmatricolazione); }
    public void setMarca(String marcaNuova) { setVeicolo(targa, marcaNuova, modello, annoImmatricolazione); }
    public void setModello(String modelloNuovo) { setVeicolo(targa, marca, modelloNuovo, annoImmatricolazione); }
    public void setAnnoImmatricolazione(int annoImmatricolazioneNuovo) { setVeicolo(targa, marca, modello, annoImmatricolazioneNuovo); }

    public String getTarga() { return targa; }
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public int getAnnoImmatricolazione() { return annoImmatricolazione; }

    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        System.out.println("Inserisci la targa: ");
        String targaInput = tas.next();
        System.out.println("Inserisci la marca: ");
        String marcaInput = tas.next();
        System.out.println("Inserisci il modello: ");
        String modelloInput = tas.next();
        System.out.println("Inserisci anno immatricolazione: ");
        int annoImmatricolazioneInput = tas.nextInt();
        setVeicolo(targaInput, marcaInput, modelloInput, annoImmatricolazioneInput);
    }

    public void scriviOutput() {
        System.out.println("Targa: "+targa);
        System.out.println("Marca: "+marca);
        System.out.println("Modello: "+modello);
        System.out.println("Anno immatricolazione: "+annoImmatricolazione);
    }

    public boolean daRevisione() {
        int anniTrascorsi = 2025 - annoImmatricolazione;
        if (anniTrascorsi < 4) {
            return false;
        }  else {
            int anni = 2025-anniTrascorsi-4;
            if (anni%2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
