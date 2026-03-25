public class NodoListaEvento {

    private Evento evento;
    private NodoListaEvento successivo;

    public NodoListaEvento() {
        this.evento = null;
        this.successivo = null;
    }

    public NodoListaEvento(Evento evento, NodoListaEvento successivo) {
        this.evento = evento;
        this.successivo = successivo;
    }

    public void setEvento(Evento evento) { this.evento = evento; }
    public void setSuccessivo(NodoListaEvento successivo) { this.successivo = successivo; }

    public Evento getEvento() { return this.evento; }
    public NodoListaEvento getSuccessivo() { return this.successivo; }
}
