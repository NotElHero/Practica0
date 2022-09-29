
public class Vehiculo {

    static int PRECIO = 12000;
    static String COLOR = "blanco";
    static String COLORES[] = {"blanco", "negro", "rojo", "azul", "verde", "gris"};
    static String GAMA = "media";
    static String GAMAS[] = {"alta", "media", "baja"};
    static int PESO = 1500;

    int precio;
    String color;
    String gama;
    int peso;

    public int getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getGama() {
        return gama;
    }

    public String comprobarGama(String gama) {
        this.gama = gama;
        for (int i = 0; i < 2; i++) {
            if (GAMAS[i].equals(gama)) {
                gama.toLowerCase().equals(GAMAS[i]);
            } else {
                gama.equals(GAMA);
            }
        }
        return gama;
    }

    public String comprobarColor(String color) {
        this.color = color;
        for (int i = 0; i < 2; i++) {
            if (COLORES[i].equals(color)) {
                color.toLowerCase().equals(COLORES[i]);
            } else {
                color.equals(COLOR);
            }
        }
        return color;
    }

    public void precioFinal() {
        switch (gama) {
            case "alta":
                precio += 2000;
                break;
            case "media":
                precio += 1200;
                break;
            case "baja":
                precio += 600;
                break;
        }
        if (peso >= 1800) {
            precio += 1500;
        } else if (peso >= 1400 && peso < 1800) {
            precio += 1000;
        } else if (peso > 1200 && peso < 1400) {
            precio += 350;
        }
        System.out.println("El precio total del vehiculo color " + color.toLowerCase() + " de gama " + gama.toLowerCase() + " es de: " + precio + "€");
    }

}
