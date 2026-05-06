public class ListaMedici {

    private NodoListaMedico testa;

    public ListaMedici() {
        this.testa = null;
    }

    public void aggiungiMedico(Medico medico) {
        testa = new NodoListaMedico(medico, testa);
    }

    public void aggiungiMedicoInCoda(Medico medico) {
        if(testa == null) {
            aggiungiMedico(medico);
        } else {
            NodoListaMedico puntatore = testa;
            while(puntatore.getNext() != null) {
                puntatore = puntatore.getNext();
            }
            puntatore.setNext(new NodoListaMedico(medico, null));
        }
        System.out.println("Medico Aggiunto!");
    }

    public void visualizzaMedici() {
        NodoListaMedico puntatore = testa;
        if (testa == null) {
            System.out.println("Lista vuota!");
            return;
        }
        while(puntatore != null) {
            System.out.println(puntatore.getMedico().toString());
            puntatore = puntatore.getNext();
        }
    }

    public Medico cercaMedico(String codice) {
        NodoListaMedico puntatore = testa;
        if (testa == null) {
            System.out.println("Lista vuota!");
            return null;
        }
        while(puntatore != null) {
            if(puntatore.getMedico().getCodice().equalsIgnoreCase(codice)) {
                return puntatore.getMedico();
            }
            puntatore = puntatore.getNext();
        }
        return null;
    }

    public boolean rimuoviMedico(String codice) {
        Medico medico = cercaMedico(codice);
        if (testa == null) {
            System.out.println("Lista vuota!");
            return false;
        }
        if(medico != null) {
            if(testa.getMedico() == medico) {
                testa = testa.getNext();
                return true;
            }
            NodoListaMedico puntatore = testa;
            while(puntatore != null) {
                if(puntatore.getNext().getMedico() == medico) {
                    puntatore.setNext(puntatore.getNext().getNext());
                    return true;
                }
            }
        }
        return false;
    }

    public void visualizzaMediciDisponibili() {
        NodoListaMedico puntatore = testa;
        if (testa == null) {
            System.out.println("Lista vuota!");
            return;
        }
        while(puntatore != null) {
            if(puntatore.getMedico().getDisponibile()) {
                System.out.println(puntatore.getMedico().toString());
            }
            puntatore = puntatore.getNext();
        }
    }


    public int mediaPazienti() {
        int somma = 0;
        int count = 0;
        NodoListaMedico puntatore = testa;
        if (testa == null) {
            System.out.println("Lista vuota!");
            return 0;
        }
        while(puntatore != null) {
            if(puntatore.getMedico() instanceof MedicoBase ) {
                somma += ((MedicoBase) puntatore.getMedico()).getNumeroAssistiti();
                count ++;
            }
            puntatore = puntatore.getNext();
        }
        int media = somma/count;
        return media;
    }

    public int contaSpecialisti() {
        if (testa == null) {
            System.out.println("Lista vuota!");
            return 0;
        }
        int somma = 0;
        NodoListaMedico puntatore = testa;
        while(puntatore != null) {
            if(puntatore.getMedico() instanceof MedicoSpecialista) {
                somma ++;
            }
            puntatore = puntatore.getNext();
        }
        return somma;
    }

}

