import java.util.Random;

public class JavaRandomClass {
    public static void main(String[] args) {
        String []colores = {"Verde", "Naranja", "Negro", "Azul", "Violeta", "Marron"};

        double random = Math.random();

        random *= colores.length;

        System.out.println("colores = " + colores[(int)random]);//Castin en random ya que genera un double y el string recibe un int.

        if ((int)random == 5){
            System.out.println("Hello, nice...");
        }else{
            System.out.println("Hello world");
        }

        /**
         * Retornar numeros aleatorios con la clase random de java util, es mas flexible ya que permite generar numeros,
         * de tipo long, double, float, etc. mientras que en el math.random solo genera de tipo double.
         */
        Random numeroalea = new Random();
        int numeroRandom = 10 + numeroalea.nextInt(30-10);//Si queremos un numero con extremos especificos, generara un numero aleatorio entre 10 y 30
        System.out.println("numeroRandom = " + numeroRandom);//Genera un numero aleatorio desde -2 a la 32 hasta 2 a la 32

        long numeroRandom2 = numeroalea.nextLong();
        System.out.println("numeroRandom2 = " + numeroRandom2);
    }
}
