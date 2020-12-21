import java.util.Scanner;

/*
    Se debe crear una app de consola para obtener
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que le va a permitir conocer los numeros par");
        System.out.println("Ingrese la cantidad a partir de la que quiere conocer los numeros primos: ");
        int numeros = sc.nextInt();

        for (int index = 0; numeros < index; numeros++) {
            if (numeros % numeros == 2) {
                System.out.println(numeros);
            } else {
                System.out.println("Intente de nuevo...");
            }
        }
    }
}
