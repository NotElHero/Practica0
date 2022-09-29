public class Furgoneta extends Vehiculo{
    static double CARGA = 6.5;
    static boolean ELECTRICO = false;

    double carga;
    boolean electrico;

    public double getCarga() {
        return carga;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void precioFinal() {
        if (carga > 7.5) {
            precio += precio % 30;
        }
        if (electrico == true) {
            precio += 2850;
        }
    }
}
