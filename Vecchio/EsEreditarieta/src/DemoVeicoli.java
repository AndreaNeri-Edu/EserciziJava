public class DemoVeicoli {
    public static void main(String[] args) {
        Veicolo veicolo = new Veicolo("DA123GH", "BMW", "sport", 2008);
        Vettura vettura = new Vettura("NG371JQ", "Fiat", "500","sport", 2014);
        Motociclo motociclo = new Motociclo("AA000NM", "Valenti", "motard",125, 2014);

        veicolo.scriviOutput();
        System.out.println("Da revisione: "+veicolo.daRevisione());
        System.out.println(" ");
        vettura.scriviOutput();
        System.out.println("Da revisione: "+veicolo.daRevisione());
        System.out.println(" ");
        motociclo.scriviOutput();
        System.out.println("Da revisione: "+veicolo.daRevisione());

    }
}
