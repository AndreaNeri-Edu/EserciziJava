public class Libro extends Pubblicazione{
    //ATTRIBUTI
    private String isbn;
    private String autore;
    private int numeroPagine;
    private boolean disponibile;

    //COSTRUTTORE
    public Libro(String titolo, String isbn,String autore, int numeroPagine, boolean disponibile) {
        super(titolo);
        this.autore = autore;
        this.isbn = isbn;
        this.numeroPagine = numeroPagine;
        this.disponibile = disponibile;
    }

    //METODI GET e SET
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public String getAutore() {return autore;}
    public void setAutore(String autore) {this.autore = autore;}
    public int getNumeroPagine() {return numeroPagine;}
    public void setNumeroPagine(int numeroPagine) {this.numeroPagine = numeroPagine;}
    public boolean getDisponibile() {return disponibile;}
    public void setDisponibile(boolean disponibile) {this.disponibile = disponibile;}

    //METODI
    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%s", isbn, autore, getTitolo(), numeroPagine, disponibile);
    }
}