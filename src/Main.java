import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculo v1 = new Vehiculo();
        v1.precio = 12000;
        v1.peso = 150;
        v1.gama = "media";
        v1.color = "blanco";

        v1.precioFinal();

        Vehiculo v2 = new Vehiculo();
        System.out.println("Define el precio del vehiculo:");
        v2.precio = sc.nextInt();
        System.out.println("Define el peso del vehiculo:");
        v2.peso = sc.nextInt();
        System.out.println("Define la gama del vehiculo:");
        v2.gama = sc.next();
        System.out.println("Define el color del vehiculo:");
        v2.color = sc.next();

        v2.precioFinal();
    }
}