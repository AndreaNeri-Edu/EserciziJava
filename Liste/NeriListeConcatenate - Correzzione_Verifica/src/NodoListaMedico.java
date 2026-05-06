public class NodoListaMedico {

    private Medico medico;
    private NodoListaMedico next;

    public NodoListaMedico() {
        medico = null;
        next = null;
    }

    public NodoListaMedico(Medico medico, NodoListaMedico next) {
        this.medico = medico;
        this.next = next;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public NodoListaMedico getNext() {
        return next;
    }

    public void setNext(NodoListaMedico next) {
        this.next = next;
    }

}
