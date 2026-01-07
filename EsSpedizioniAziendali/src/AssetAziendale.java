import java.util.Scanner;

public class AssetAziendale {
    private String dataAcquisto;

    public AssetAziendale(String dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        System.out.print("Inserisci data di acquisto: ");
        dataAcquisto = tas.nextLine();
    }

    public void scriviOutput() {
        System.out.println("Data di acquisto: " + dataAcquisto);
    }

    public String getDataAcquisto() {
        return dataAcquisto;
    }
}