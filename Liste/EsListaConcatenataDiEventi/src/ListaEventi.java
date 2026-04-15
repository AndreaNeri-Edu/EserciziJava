public class ListaEventi {

    private NodoListaEvento testa;

    public ListaEventi() {
        testa = null;
    }

    public void aggiungiEvento(Evento evento) {
        testa = new NodoListaEvento(evento, testa);
    }

    public void aggiungiEventoInCoda(Evento evento) {
        if(testa == null) { aggiungiEvento(evento); }
        else {
            NodoListaEvento posizione = testa;
            while(posizione.getSuccessivo() != null) {
                posizione = posizione.getSuccessivo();
            }
            posizione.setSuccessivo(new NodoListaEvento(evento, null));
        }
    }

    public void visualizzaEventi(Evento evento) {
        if(testa == null) {
            System.out.println("Errore: non ci sono eventi");
        }
        else {
            NodoListaEvento posizione = testa;
            while(posizione != null) {
                System.out.println(posizione.getEvento().toString());
                posizione =  posizione.getSuccessivo();
            }
        }
    }

    public Evento cercaEvento(String titolo) {
        NodoListaEvento posizione = testa;

        while(posizione != null) {
            String titoloAllaPosizione = posizione.getEvento().getTitolo();

            if(titoloAllaPosizione.equalsIgnoreCase(titolo)) {
                return posizione.getEvento();
            } else {
                posizione = posizione.getSuccessivo();
            }
        }
        return null;
    }

    public boolean rimuoviEvento(String titolo) {
        Evento evento = cercaEvento(titolo);
        if(evento != null) {
            if(testa.getEvento() == evento) { testa = testa.getSuccessivo(); return true;}

            NodoListaEvento precedente = testa;
            while (precedente.getSuccessivo() != null) {
                if(precedente.getSuccessivo().getEvento() == evento) {
                    precedente.setSuccessivo(precedente.getSuccessivo().getSuccessivo());
                    return true;
                }
                precedente = precedente.getSuccessivo();
            }
            return false;
        } else {
            System.out.println("Errore: evento non trovato");
            return false;
        }
    }

}
