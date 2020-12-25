import javax.swing.*;

public class Ejercicio14 {
    /*
    Lee un numero por teclado y muestra por consola,
    el caracter al que pertenece en la tabla ASCII.
    Por ejemplo, si introduzco un 97, me muestra una A.
     */

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");

        /** Se pasa el codigo de string a int**/
        int codigo = Integer.parseInt(texto);
        /** Luego pasamos el codigo a caracter*/
        char caracter = (char)codigo;

        System.out.println(caracter);
    }
}
