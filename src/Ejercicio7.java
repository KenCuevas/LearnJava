import java.util.Scanner;
public class Ejercicio7 {
    /*
Lee un número por teclado y comprueba que
este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while),
después muestra ese número por consola.
     */
    public static void main(String[] args) {
    int numeroUsuario;
        Scanner lecturaDatos = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero mayor que 0");
            numeroUsuario = lecturaDatos.nextInt();
        }while (numeroUsuario <= 0);

        System.out.println(numeroUsuario);
    }
}
