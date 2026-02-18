public class ExceptionLibro extends RuntimeException {
    public ExceptionLibro(String e) {
        super("Errore: "+e);
    }
}
