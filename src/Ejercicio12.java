import java.util.Scanner;
public class Ejercicio12 {

    /*Pedir dos palabras por teclado, indicar si son iguales.*/

    public static void main(String[] args) {
        //Instancia de la clase Scanner que nos permitira pedir y leer datos por consola.
        Scanner sc = new Scanner (System.in);

        String primeraPalabra;
        String segundaPalabra;

        System.out.println("Ingresa la primera palabra: ");
        primeraPalabra = sc.nextLine();

        System.out.println("Ingresa la segunda palabra: ");
        segundaPalabra = sc.nextLine();

        //Utilizamos el metodo equals para evaluar si los string son iguales.
        if (primeraPalabra.equals(segundaPalabra)){
            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras son diferentes");
        }
    }
}
