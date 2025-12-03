import java.util.Scanner;

public abstract class Persona {
    protected String nome;
    protected String cognome;
    protected int anno;
    protected float peso;
    protected float altezza;

    public Persona() {
        this.nome = null;
        this.cognome = null;
        this.anno = 0;
        this.peso = 0;
        this.altezza = 0;
    }

    public Persona(String nome, String cognome, int anno, float peso, float altezza) { setPersona(nome, cognome, anno, peso, altezza); }

    public void setPersona(String nomeNuovo, String cognomeNuovo, int annoNuovo, float pesoNuovo, float altezzaNuovo) {
        this.nome = nomeNuovo;
        this.cognome = cognomeNuovo;
        this.anno = annoNuovo;
        this.peso = pesoNuovo;
        this.altezza = altezzaNuovo;
    }
    public void setNome(String nomeNuovo) { setPersona(nomeNuovo, cognome, anno, peso, altezza); }
    public void setCognome(String cognomeNuovo) { setPersona(nome, cognomeNuovo, anno, peso, altezza); }
    public void setAnno(int annoNuovo) { setPersona(nome, cognome, annoNuovo, peso, altezza); }
    public void setPeso(float pesoNuovo) { setPersona(nome, cognome, anno, pesoNuovo, altezza); }
    public void setAltezza(float altezzaNuovo) { setPersona(nome, cognome, anno, peso, altezzaNuovo); }

    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getAnno() { return anno; }
    public float getPeso() {return peso; }
    public float getAltezza() { return altezza;}

    public void leggiInput() {
        Scanner tas = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = tas.next();
        System.out.println("Cognome: ");
        this.cognome = tas.next();
        System.out.println("Anno di nascita: ");
        this.anno = tas.nextInt();
        System.out.println("Peso: ");
        this.peso = tas.nextFloat();
        System.out.println("Altezza: ");
        this.altezza = tas.nextFloat();
    }

    public void scriviOutput() {
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Anno di nascita: "+anno);
        System.out.println("Peso: "+peso);
        System.out.println("Altezza: "+altezza);
    }

    public int eta() { return 2025- this.anno; }
    public boolean maggiorenne() { if(eta() > 18) { return true; } else { return false; } }

    public float indiceMCorporea() { return peso/(altezza*altezza); }
    public float indiceCorporeoMedio(Persona[] persone) {
        float somma = 0;
        for(int i=0; i< persone.length; i++) {
            somma += persone[i].indiceMCorporea();
        }
        return somma/persone.length;
    }

}
