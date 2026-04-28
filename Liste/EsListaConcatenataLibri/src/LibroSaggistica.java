public class LibroSaggistica extends Libro {
    private String argomento;

    public LibroSaggistica(String titolo, String isbn, int numeroPagine, boolean disponibile, String argomento) {
        super(titolo, isbn, numeroPagine, disponibile);
        this.argomento = argomento;
    }

    public String getArgomento() { return argomento; }
    public void setArgomento(String argomento) { this.argomento = argomento; }
}