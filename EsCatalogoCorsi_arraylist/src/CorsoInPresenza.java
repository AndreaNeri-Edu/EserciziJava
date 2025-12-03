public class CorsoInPresenza extends Corso {
    private String indirizzo;

    public CorsoInPresenza(String nome, String docente, int durataOre, String indirizzo) {
        super(nome, docente, durataOre);
        if(indirizzo.equalsIgnoreCase("")){
            System.out.println("Errore! Indirizzo non valido.");
            System.exit(0);
        }
        this.indirizzo = indirizzo;
    }

    @Override
    public String descrivi() {
        return "Nome corso: "+nome+" Docente: "+docente+" Durata: "+durataOre+" Indirizzo: "+indirizzo;
    }
}