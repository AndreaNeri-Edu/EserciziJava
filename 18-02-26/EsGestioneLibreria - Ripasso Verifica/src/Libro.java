public class Libro extends Pubblicazione{
    private String isbn;
    private int numPagine;
    private boolean disponibile;

    public Libro(String titolo, String isbn, int numPagine, boolean disponibile) {
        super(titolo);
        this.isbn = isbn;
        this.numPagine = numPagine;
        this.disponibile = disponibile;
    }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setDisponibile(boolean disponibile) { this.disponibile = disponibile; }
    public void setNumPagine(int numPagine) { this.numPagine = numPagine; }

    public String getIsbn() { return isbn; }
    public boolean isDisponibile() { return disponibile; }
    public int getNumPagine() { return numPagine; }

    @Override
    public String toString() {
        return isbn +";"+ getTitolo()+";"+numPagine+";"+disponibile;
    }
}
