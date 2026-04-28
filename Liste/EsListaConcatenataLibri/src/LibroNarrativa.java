public class LibroNarrativa extends Libro {
    private String genere;

    public LibroNarrativa(String titolo, String isbn, int numeroPagine, boolean disponibile, String genere) {
        super(titolo, isbn, numeroPagine, disponibile);
        this.genere = genere;
    }

    public String getGenere() { return genere; }
    public void setGenere(String genere) { this.genere = genere; }
}