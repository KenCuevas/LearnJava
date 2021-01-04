import java.util.Arrays;

public class PracticaDeArrays {
    public static void main(String[] args) {
        String[] Productos = new String[5];

        Productos[0] = "Nevera Oster";
        Productos[1] = "Licuadora Oster";
        Productos[2] = "Tostadora Oster";
        Productos[3] = "Microondas Oster";
        Productos[4] = "Freidora Oster";
    /*
        for (int i = 0; i < Productos.length; i++){
            System.out.println("Productos: = " + Productos[i]);
        }
*/      int total = Productos.length;
        for (String prod: Productos) {
            System.out.println("prod = " + prod);
        }
        //Arrays.sort(Productos);

        //Iterar un array en orden inverso.
        for (int i = 0; i < total; i++){
            System.out.println("Productos indice: = " + (total-1-i) + Productos[total-1]);
        }
    }
}
