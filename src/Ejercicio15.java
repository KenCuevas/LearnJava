import javax.swing.*;

public class Ejercicio15 {
    /*
    Modifica el ejercicio anterior,
    para que en lugar de pedir un número,
    pida un carácter (char) y muestre su código en la tabla ASCII.
     */

    public static void main(String[] args) {
        String caracter = JOptionPane.showInputDialog("Introduce el caracter de la tabla ASCII");

        char carac = caracter.charAt(0);
        int codigo = (int)carac;

        System.out.println("Pulsa Alt " + codigo);
    }
}
