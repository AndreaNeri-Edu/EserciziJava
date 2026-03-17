import java.util.Scanner;

public class PersonaDemo {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.leggiInput();
        System.out.println("Dati:");
        persona1.scriviOutput();
        System.out.println("Eta: "+ persona1.eta(persona1));
        if (!persona1.maggiorenne(persona1)) { System.out.println("Non maggiorenne!"); } else System.out.println("Maggiorenne!");

        float imc = Persona.indiceMCorporea(persona1);
        System.out.println("Indice di Massa Corporea: "+ imc);

        if (imc < 18.5) {
            System.out.println("Condizione: magro");
        } else if (imc < 25) {
            System.out.println("Condizione: normale");
        } else if (imc < 30) {
            System.out.println("Condizione: sovrappeso");
        } else if (imc < 40){
            System.out.println("Condizione: obeso");
        } else {
            System.out.println("Condizione: graveobeso");
        }





    }
}
