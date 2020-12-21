import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    /*
    Ejercicio tomado de Sololearn

    Necesitas un programa para convertir los dias en segundos.
    El codigo dado toma la cantidad de dias como entrada. Completa
    el codigo para convertirlo en segundos y genera un resultado.

    Entrada: 12
    Salida: 1036800
     */

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de dias: ");
        int dias = lecturaDatos.nextInt();

        int segundos = dias * 24 * 60 * 60;
        //int minutos = horas * 60;
        //int segundos = minutos * 60;

        System.out.println("La cantidad de dias registrados es: " + dias);
        System.out.println("La cantidad de segundos en los dias registrados asciende a: " + segundos);

    }
}
