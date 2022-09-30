public class Coche extends Vehiculo {
    static int POTENCIA = 110;

    int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void precioFinal() {
        if (potencia > 110) {
            precio += 800;
        }
        System.out.println("El precio total del coche de color es de: " + precio + "€");
    }
}
