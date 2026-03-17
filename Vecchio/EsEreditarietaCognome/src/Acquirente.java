import java.util.Scanner;

public class Acquirente extends Persona {

    private String nome, codice, eMail;

    public Acquirente() { }
    public Acquirente(String nome, String cognome, int anno, float peso, float altezza, String codice, String eMail) {
        String nomeCompleto = nome + " " + cognome;
        super(nome, cognome, anno, peso, altezza);
        setAcquirente(nomeCompleto, codice, eMail);
    }

    public void setAcquirente(String nomeNuovo, String codiceNuovo, String eMailNuovo) {
        this.nome = nomeNuovo;
        this.codice = codiceNuovo;
        this.eMail = eMailNuovo;
    }

    @Override
    public String getNome() { return nome; }
    public String getCodice() { return codice; }
    public String getEMail() { return eMail; }

    @Override
    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        super.leggiInput();
        System.out.println("Inserisci codice acquirente: ");
        this.codice = tas.next();
        System.out.println("Inserisci eMail acquirente: ");
        this.eMail = tas.next();
    }

    @Override
    public void scriviOutput() {
        super.scriviOutput();
        System.out.println("Codice: "+codice);
        System.out.println("EMail: "+eMail);
    }

    public boolean equals(Acquirente altro) {
        if(altro == null) { return false; }
        else {
            return this.getNome().equals(altro.getNome());
        }
    }
}
