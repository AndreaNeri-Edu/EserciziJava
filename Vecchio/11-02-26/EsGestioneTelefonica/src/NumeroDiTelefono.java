import java.io.Serializable;

public class NumeroDiTelefono implements Serializable{
    private String prefissoInt;
    private String prefissoNaz;
    private String numero;


    public NumeroDiTelefono(String unaStringa) throws FormatoNumeroErratoException {
        String[] parti = unaStringa.split("-");

        for(String parte : parti) {
            for (int i = 0; i < parte.length(); i++) {
                if(!Character.isDigit(parte.charAt(i))) {
                    throw new FormatoNumeroErratoException("Il numero deve contenere solo cifre (0-9)");
                }
            }
        }

        if(parti.length == 3) {
            this.prefissoInt = parti[0];
            this.prefissoNaz = parti[1];
            this.numero = parti[2];
        } else if(parti.length == 2) {
            this.prefissoInt = null;
            this.prefissoNaz = parti[0];
            this.numero = parti[1];
        } else {
            throw new FormatoNumeroErratoException("Formato non valido!");
        }

        if(prefissoNaz.length() != 2) {
            throw new FormatoNumeroErratoException("Lunghezza prefisso nazionale errato (2)");
        }
        if(numero.length() != 6) {
            throw new FormatoNumeroErratoException("Lunghezza numero telefono errato (6)");
        }

    }

    @Override
    public String toString() {
        if(prefissoInt == null) {
            return prefissoNaz+"-"+numero;
        } else {
            return prefissoInt+"-"+prefissoNaz+"-"+numero;
        }
    }

}


