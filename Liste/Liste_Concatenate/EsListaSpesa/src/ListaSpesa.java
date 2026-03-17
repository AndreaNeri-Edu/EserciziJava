public class ListaSpesa {
    private Nodo prodottoIniziale; // La "testa" della lista
    private Nodo corrente;         // Dove si trova attualmente nella lista

    // --- INNER CLASS: Il singolo prodotto ---
    private class Nodo {
        String nome;
        Nodo prossimo; // Collegamento al successivo

        Nodo(String nome, Nodo prossimo) {
            this.nome = nome;
            this.prossimo = prossimo;
        }
    }

    // Metodo per aggiungere un prodotto all'inizio
    public void aggiungi(String articolo) {
        prodottoIniziale = new Nodo(articolo, prodottoIniziale);
    }

    // --- METODI DELL'ITERATORE ---
    public void reset() {
        corrente = prodottoIniziale; // Ricomincia dal primo [cite: 83, 85]
    }

    public boolean haAncoraProdotti() {
        return corrente != null; // Controlla se il vagone esiste [cite: 91, 92]
    }

    public String leggiEAvanza() {
        String nome = corrente.nome;
        corrente = corrente.prossimo; // Sposta il riferimento al prossimo [cite: 97, 100]
        return nome;
    }
}