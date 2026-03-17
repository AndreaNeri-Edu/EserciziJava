import java.util.Scanner;

public class Persona {
    private String nome;
    private String cognome;
    private int anno;
    private float peso;
    private float altezza;

    // COSTRUTTORI
    public Persona() {
        nome = null;
        cognome = null;
        anno = 0;
        peso = 0;
        altezza = 0;
    }

    public Persona(String nome, String cognome, int anno, float peso, float altezza) { setPersona(nome,cognome,anno,peso,altezza); }

    // SET
    public void setPersona(String nomeNuovo, String cognomeNuovo, int annoNuovo, float pesoNuovo, float altezzaNuovo) {
        this.nome = nomeNuovo;
        this.cognome = cognomeNuovo;
        this.anno = annoNuovo;
        this.peso = pesoNuovo;
        this.altezza = altezzaNuovo;
    }

    public void setNome(String nomeNuovo) { setPersona(nomeNuovo,cognome,anno,peso,altezza); }
    public void setCognome(String cognomeNuovo) { setPersona(nome,cognomeNuovo,anno,peso,altezza); }
    public void setAnno(int annoNuovo) { setPersona(nome,cognome,annoNuovo,peso,altezza); }
    public void setPeso(float pesoNuovo) { setPersona(nome,cognome,anno,pesoNuovo,altezza); }
    public void setAltezza(float altezzaNuovo) { setPersona(nome,cognome,anno,peso,altezzaNuovo); }

    // GET
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getAnno() { return anno; }
    public float getPeso() { return peso; }
    public float getAltezza() { return altezza; }

    // LEGGI INPUT
    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        String nomeInput = tas.next();
        System.out.println("Inserisci il cognome: ");
        String cognomeInput = tas.next();
        System.out.println("Inserisci l'anno di nascita: ");
        int annoInput = tas.nextInt();
        System.out.println("Inserisci il peso: ");
        float pesoInput = tas.nextFloat();
        System.out.println("Inserisci l'altezza: ");
        float altezzaInput = tas.nextFloat();
        setPersona(nomeInput,cognomeInput,annoInput,pesoInput,altezzaInput);
    }

    // SCRIVI OUTPUT
    public void scriviOutput() {
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Anno di nascita: "+anno);
        System.out.println("Peso: "+peso);
        System.out.println("Altezza: "+altezza);
    }

    // CALCOLO ETA'
    public int eta(Persona persona) { return 2025-persona.getAnno(); }

    // CONTROLLO SE MAGGIORENNE
    public boolean maggiorenne(Persona persona) {
        int eta = eta(persona);
        if (eta >= 18) return true;
        else return false;
    }

    // CALCOLO MASSA CORPOREA
    public static float indiceMCorporea(Persona persona) { return persona.peso / (persona.altezza * persona.altezza); }

    // CALCOLO MEDIA MASSA CORPOREA
    public float indiceCorporeoMedio(Persona[] persone) {
        float somma = 0;
        for(int i = 0; i< persone.length; i++) {
            somma += indiceMCorporea(persone[i]);
        }
        return somma / persone.length;
    }
}
