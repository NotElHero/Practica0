public class Vehiculo {

    static int PRECIO = 12000;
    static String COLOR = "blanco";
    static String GAMA = "Media";
    static int PESO = 1500;

    int precio;
    String color;
    String gama;
    int peso;

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

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


}
