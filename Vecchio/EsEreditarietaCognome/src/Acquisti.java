public class Acquisti {
    private Acquisto[] acquisti;
    private int numeroAcquisti;

    public Acquisti(int maxAcquisti) {
        acquisti = new Acquisto[maxAcquisti];
        numeroAcquisti = 0;
    }

    public void inserimetoAcquisto(Acquisto nuovoAcquisto) {
        if(numeroAcquisti < acquisti.length) {
            acquisti[numeroAcquisti] = nuovoAcquisto;
            numeroAcquisti++;
            System.out.println("Acquisto Aggiunto");
        } else { System.out.println("Errore! Archivio pieno."); }
    }

    public void visualizzaAcquisti() {
        if(numeroAcquisti == 0) {
            System.out.println("Archivio Vuoto");
        } else {
            for(int i=0; i<numeroAcquisti; i++) {
                acquisti[i].scriviOutput();
            }
        }
    }

    public void acquistoMinore() {
        if (numeroAcquisti == 0) {
            System.out.println("Archivio Vuoto");
        } else {
            double min = acquisti[0].getImporto();
            int indice = 0;

            for(int i=1; i<numeroAcquisti; i++) {
                if(acquisti[i].getImporto() < min) {
                    min = acquisti[i].getImporto();
                    indice = i;
                }
            }

            System.out.println("--- Acquisto Minore ---");
            acquisti[indice].scriviOutput();
        }
    }

    public void ValoreMedioAcquisti() {
        if (numeroAcquisti == 0) {
            System.out.println("Archivio Vuoto");
        } else {
            double somma = 0;

            for(int i=0; i<numeroAcquisti; i++) {
                somma += acquisti[i].getImporto();
            }

            double media = Math.round((somma/numeroAcquisti) * 100.0) / 100.0;
            System.out.println("Media Importo Acquisti: "+media);
        }
    }


}
