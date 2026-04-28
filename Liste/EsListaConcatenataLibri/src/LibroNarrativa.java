public class LibroNarrativa extends Libro {
    private String genere;

    public LibroNarrativa(String titolo, String isbn,String autore, int numeroPagine, boolean disponibile, String genere) {
        super(titolo, isbn, autore, numeroPagine, disponibile);
        this.genere = genere;
    }

    public String getGenere() { return genere; }
    public void setGenere(String genere) { this.genere = genere; }

    @Override
    public String toString() {
        return "NARRATIVA;"+super.toString()+";"+genere;
    }
}