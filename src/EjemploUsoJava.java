import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploUsoJava {
    public static void main(String[] args) {
        Date fecha = new Date ();

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/YYYY");
        String fechastr = df.format(fecha);
        System.out.println("fecha = " + fechastr);
    }
}
