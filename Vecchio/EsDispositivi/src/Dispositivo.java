public class Dispositivo {
    private String marca, modello;
    private int codice;
    private Cliente proprietario;

    public Dispositivo(String marca, String modello, int codice, Cliente proprietario) { setDispositivo(marca, modello, codice, proprietario); }
    public void setDispositivo(String marcaNuovo, String modelloNuovo, int codiceNuovo, Cliente proprietarioNuovo) {
        this.marca = marcaNuovo;
        this.modello = modelloNuovo;
        this.codice = codiceNuovo;
        this.proprietario = proprietarioNuovo;
    }


}
