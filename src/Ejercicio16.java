import java.util.Scanner;

public class Ejercicio16 {
    /*
    Escribe una aplicación con un String que contenga una contraseña cualquiera.
    Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando
    aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”.
    Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
     */
    public static void main(String[] args) {
        String contraseña = "Cuevas";
        int intentosPermitidos = 3;
        Scanner sc = new Scanner(System.in);
        boolean intentos = false;


        String pass;
        for (int i = 0; i < intentosPermitidos && !intentos; i++){
            System.out.println("Ingresa la contraseña");
            pass = sc.nextLine();
            if (pass.equals(contraseña)){
                System.out.println("Enhorabuena...");
                //Renombramos la variable a true para que nos permita parar el bucle.
                intentos=true;
            }
        }
        /*
        do {
            int intentos = 0;
            if (intentos > 3){

            }
            System.out.println("Ingrese la contraseña");
            contraseña = sc.next();
        }while (contraseña.equals(contraseña));
*/
    }
}
