import java.util.Calendar;
import java.util.Date;

public class PracticaClaseCalendario {
    public static void main(String[] args) {

        //Esta es una clase abstracta, es decir, que no permite crear la instancia completa con el operador new
        Calendar calendario = Calendar.getInstance();
        calendario.set(2058, 07, 27);
        Date fecha = calendario.getTime();

        System.out.println("calendario = " + fecha);

    }
}
