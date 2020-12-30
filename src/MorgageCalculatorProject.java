import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculatorProject {
    /*
    Crear una calculadora de hipotecas con los siguientes requerimientos:

    1- Pedir por consola el capital o cantidad del prestamo
    2- Pedir la tasa de interes anual
    3- Pedir los periodos en años
    4- Lanzar por consola el costo de la hipoteca.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        /*Inicializamos las variables y guardamos los datos para poder cumplir con los requerimientos*/
        int pagoPrincipal;
        System.out.println("Principal:");
        pagoPrincipal = sc.nextInt();
        float interesAnual;
        System.out.println("Enter the annual interest rate: ");
        interesAnual = sc.nextFloat();
        float interesMensual = interesAnual / PERCENT / MONTHS_IN_YEARS;
        byte periodoEnAnos; 
        System.out.println("Enter the period (YEARS): ");
        periodoEnAnos = sc.nextByte();
        int cantidadDePagos = periodoEnAnos * MONTHS_IN_YEARS;

        //Formula para calcular las hipotecas tomada de wikihow
        double mortgageCalculatorFinal = pagoPrincipal
                * (interesMensual * Math.pow(1 + interesMensual, cantidadDePagos)
        / (Math.pow(1 + interesMensual, cantidadDePagos)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgageCalculatorFinal);
        System.out.println("Mortgage :" + mortgageFormatted);

    }
}
