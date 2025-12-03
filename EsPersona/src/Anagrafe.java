public class Anagrafe {
    private Persona[] persone;
    private int numPersone;

    public Anagrafe(int numPersoneIniziale) {
        persone = new Persona[numPersoneIniziale];
        numPersone = numPersoneIniziale;
    }

    public void inserimentoDati() {
        for(int i = 0; i < persone.length; i++) {
            System.out.println("PERSONA "+(i+1));
            persone[i].leggiInput();
        }
    }

    public void visualizzaPersone() {
        for(int i = 0; i < persone.length; i++) {
            System.out.println("PERSONA "+(i+1));
            persone[i].scriviOutput();
        }
    }




}
