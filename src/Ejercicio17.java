import java.util.Scanner;

public class Ejercicio17 {
    /*
Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
     */

    public static void main(String[] args) {
        String diaSemana;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el dia de la semana: ");
        diaSemana = sc.nextLine();

        switch (diaSemana){
            case "Lunes":
                System.out.println("Es dia laboral. A trabajar!");
                break;
            case "Martes":
                System.out.println("Es dia laboral. A trabajar!");
                break;
            case "Miercoles":
                System.out.println("Es dia laboral. A trabajar!");
                break;
            case "Jueves":
                System.out.println("Es dia laboral. A trabajar!");
                break;
            case "Viernes":
                System.out.println("Es dia laboral. A trabajar!");
                break;
            case "Sabado":
                System.out.println("Dia no laborable, es tu dia de descanso");
                break;
            case "Domingo":
                System.out.println("Dia no laborable, es tu dia de descanso");
                break;
            default:
                System.out.println("Esa loquera...");
        }

    }
}
