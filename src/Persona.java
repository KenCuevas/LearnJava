import java.util.Scanner;
public class Persona {
    /*
Confeccionar una clase que permita carga el nombre y la edad de una persona.
Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
 */
    private Scanner teclado;
    private String nombre;
    private int edad;

    public void inicializar (){
        teclado = new Scanner (System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.next();
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
    }
    public void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public void esMayordeEdad (){
        if (edad > 18){
            System.out.println( nombre + " es mayor de edad...");
        }else {
            System.out.println(nombre + " No eres mayor de edad");
        }
    }
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayordeEdad();
    }

}
