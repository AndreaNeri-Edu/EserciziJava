public class Pubblicazione  {
    private String titolo;

    public Pubblicazione(String titolo) {
        if(titolo==null) { throw new ExceptionLibro("titolo non puo' essere vuoto"); }
        this.titolo = titolo;
    }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }


}
