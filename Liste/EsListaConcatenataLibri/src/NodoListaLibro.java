public class NodoListaLibro {
    private Libro libro;
    private NodoListaLibro successivo;

    public NodoListaLibro() {
        this.libro = null;
        this.successivo = null;
    }

    public NodoListaLibro(Libro libro, NodoListaLibro successivo) {
        this.libro = libro;
        this.successivo = successivo;
    }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }
    public NodoListaLibro getSuccessivo() { return successivo; }
    public void setSuccessivo(NodoListaLibro successivo) { this.successivo = successivo; }
}