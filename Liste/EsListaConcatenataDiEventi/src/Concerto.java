public class Concerto extends Evento {

    private String genereMusicale;

    public Concerto(String titolo, String luogo, String data, String genereMusicale) {
        super(titolo, luogo, data);
        this.genereMusicale = genereMusicale;
    }

    @Override
    public String toString() {
        return super.toString()+";"+genereMusicale;
    }

}
