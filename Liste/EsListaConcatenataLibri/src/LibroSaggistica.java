public class LibroSaggistica extends Libro {
    private String argomento;

    public LibroSaggistica(String titolo, String isbn,String autore, int numeroPagine, boolean disponibile, String argomento) {
        super(titolo, isbn, autore, numeroPagine, disponibile);
        this.argomento = argomento;
    }

    public String getArgomento() { return argomento; }
    public void setArgomento(String argomento) { this.argomento = argomento; }

    @Override
    public String toString() {
        return "SAGGISTICA;"+super.toString()+";"+argomento;
    }
}