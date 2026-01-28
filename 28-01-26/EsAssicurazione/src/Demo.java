import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        GestorePolizze archivio = new GestorePolizze();

        archivio.aggiungiPolizza(new PolizzaAssicurativa(101, "Mocchi", 5000, true));
        archivio.aggiungiPolizza(new PolizzaAssicurativa(102, "Bianchi", 3000, false));
        archivio.aggiungiPolizza(new PolizzaAssicurativa(103, "Gallo", 10000, true));

        Scanner tas = new Scanner(System.in);

        try {
            System.out.println("Inserisci numero della polizza: ");
        }



    }
}
