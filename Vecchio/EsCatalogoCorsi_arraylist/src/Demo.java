public class Demo {
    public static void main(String[] args) {
        CatalogoCorsi catalogo = new CatalogoCorsi();

        Corso corso1 = new CorsoInPresenza("Java Base", "Mina Filice", 10, "Via Dolce Banana 67");
        Corso corso2 = new CorsoOnline("Python Avanzato", "Ruggeri Dadda", 25, "Zoom", true);

        catalogo.aggiungiCorso(corso1);
        catalogo.aggiungiCorso(corso2);

        catalogo.mostraCorsi();
    }
}