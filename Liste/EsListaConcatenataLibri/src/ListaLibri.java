public class ListaLibri {
    private NodoListaLibro testa;

    public ListaLibri() {
        this.testa = null;
    }

    public void aggiungiLibro(Libro libro) {
        testa = new NodoListaLibro(libro, testa);
    }

    public void aggiungiLibroInCoda(Libro libro) {
        if (testa == null) {
            aggiungiLibro(libro);
        } else {
            NodoListaLibro puntatore = testa;
            while (puntatore.getSuccessivo() != null) {
                puntatore = puntatore.getSuccessivo();
            }
            puntatore.setSuccessivo(new NodoListaLibro(libro, null));
        }
    }

    public void visualizzaLibri() {
        NodoListaLibro puntatore = testa;
        while (puntatore != null) {
            System.out.println(puntatore.getLibro().toString());
            puntatore = puntatore.getSuccessivo();
        }
    }

    public Libro cercaLibro(String isbn) {
        NodoListaLibro puntatore = testa;
        while (puntatore != null) {
            if (puntatore.getLibro().getIsbn().equals(isbn)) {
                return puntatore.getLibro();
            }
            puntatore = puntatore.getSuccessivo();
        }
        return null;
    }

    public boolean rimuoviLibro(String isbn) {
        Libro libro = cercaLibro(isbn);

        if (libro != null) {
            if (testa.getLibro() == libro) {
                testa = testa.getSuccessivo();
                return true;
            }

            NodoListaLibro puntatore = testa;
            while (puntatore.getSuccessivo() != null) {
                if (puntatore.getSuccessivo().getLibro() == libro) {
                    puntatore.setSuccessivo(puntatore.getSuccessivo().getSuccessivo());
                    return true;
                }
                puntatore = puntatore.getSuccessivo();
            }
        }
        return false;
    }

    public void visualizzaLibriDisponibili() {
        NodoListaLibro puntatore = testa;
        while (puntatore != null && puntatore.getLibro().getDisponibile()) {
            System.out.println(puntatore.getLibro().toString());
            puntatore = puntatore.getSuccessivo();
        }
    }

    public int contaLibri() {
        int contatore = 0;
        NodoListaLibro puntatore = testa;
        while (puntatore != null) {
            contatore++;
            puntatore = puntatore.getSuccessivo();
        }
        return contatore;
    }

    public int contaLibriNarrativa() {
        int contatore = 0;
        NodoListaLibro puntatore = testa;
        while (puntatore != null) {
            if (puntatore.getLibro() instanceof LibroNarrativa) {
                contatore++;
            }
            puntatore = puntatore.getSuccessivo();
        }
        return contatore;
    }   
}