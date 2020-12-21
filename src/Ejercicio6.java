import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         Realiza una aplicación que nos pida un número de ventas a introducir,
         después nos pedirá tantas ventas por teclado como número de ventas
         se hayan indicado. Al final mostrara la suma de todas las ventas.
         Piensa que es lo que se repite y lo que no.
         */
        Scanner sc = new Scanner (System.in);

        int ventasRealizadas = 0;
        System.out.println("Introduzca el numero de ventas realizadas: ");
        ventasRealizadas = sc.nextInt();

        int sumaVentas = 0;

        for(int index = 0; index < ventasRealizadas; index++){
            System.out.println("Introduce el precio de la venta: " + (index+1));
            int venta = sc.nextInt();

            sumaVentas = sumaVentas + venta;
        }

        System.out.println("La suma de las ventas realizadas es igual a : " + "$RD " + sumaVentas);


    }
}
