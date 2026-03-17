public class Demo {
    public static void main(String[] args) {
        ListaSpesa miaLista = new ListaSpesa();

        miaLista.aggiungi("Pane");
        miaLista.aggiungi("Latte");
        miaLista.aggiungi("Uova");

        System.out.println("Cose da comprare:");
        miaLista.reset(); // Inizia dal primo prodotto

        while (miaLista.haAncoraProdotti()) {
            System.out.println("- " + miaLista.leggiEAvanza());
        }
    }
}