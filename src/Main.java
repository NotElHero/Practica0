import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo();
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        Coche c3 = new Coche();
        Coche c4 = new Coche();
        Furgoneta f1 = new Furgoneta();
        Furgoneta f2 = new Furgoneta();
        Furgoneta f3 = new Furgoneta();

        v1.precio = 12000;
        v1.peso = 150;
        v1.gama = "media";
        v1.color = "blanco";

        v2.precio = 16000;
        v2.peso = 100;
        v2.gama = "baja";
        v2.color = "negro";

        v3.precio = 18000;
        v3.peso = 160;
        v3.gama = "media";
        v3.color = "blanco";

        c1.precio = 12000;
        c1.peso = 200;
        c1.gama = "alta";
        c1.color = "rojo";
        c1.potencia = 110;

        c2.precio = 10000;
        c2.peso = 160;
        c2.gama = "alta";
        c2.color = "gris";
        c2.potencia = 100;

        c3.precio = 14000;
        c3.peso = 140;
        c3.gama = "media";
        c3.color = "verde";
        c3.potencia = 150;

        c4.precio = 16000;
        c4.peso = 130;
        c4.gama = "baja";
        c4.color = "negro";
        c4.potencia = 120;

        f1.precio = 11000;
        f1.peso = 210;
        f1.gama = "baja";
        f1.color = "blanco";
        f1.carga = 7.5;
        f1.electrico = true;

        f2.precio = 11000;
        f2.peso = 200;
        f2.gama = "media";
        f2.color = "blanco";
        f2.carga = 7;
        f2.electrico = true;

        f3.precio = 10000;
        f3.peso = 190;
        f3.gama = "alta";
        f3.color = "rojo";
        f3.carga = 8;
        f3.electrico = false;

        v1.precioFinal();
        v2.precioFinal();
        v3.precioFinal();
        c1.precioFinal();
        c2.precioFinal();
        c3.precioFinal();
        c4.precioFinal();
        f1.precioFinal();
        f2.precioFinal();
        f3.precioFinal();

        Vehiculo vehiculos[] = {v1, v2, v3, c1, c2, c3, c4, f1, f2, f3};

        for (int i = 0; i < 10; i++) {
            System.out.println(vehiculos[i]);
        }
    }
}