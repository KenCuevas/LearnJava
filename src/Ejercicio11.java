import java.util.Locale;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        /*
Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.

Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
    */
       Scanner sc = new Scanner (System.in);
       sc.useLocale(Locale.US);

       double operando1;
       double operando2;
       double resultadoOperacion = 0;

        System.out.println("Ingresa el primer operando: ");
        operando1 = sc.nextDouble();

        System.out.println("Ingresa el signo aritmetico de la operacion: ");
        String signoAritmetico = sc.next();

        System.out.println("Ingresa el segundo operando: ");
        operando2 = sc.nextDouble();

        switch (signoAritmetico){
            case "+":
                resultadoOperacion = operando1 + operando2;
                break;
            case "-":
                resultadoOperacion = operando1 - operando2;
                break;
            case "*":
                resultadoOperacion = operando1 * operando2;
                break;
            case "/":
                resultadoOperacion = operando1 / operando2;
                break;
            case "^":
                resultadoOperacion = (int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultadoOperacion = operando1 % operando2;
                break;
        }
        System.out.println("La operacion es: " + "\n" + operando1 + " " + signoAritmetico + " " + operando2 + " = " +resultadoOperacion);
    }
}
