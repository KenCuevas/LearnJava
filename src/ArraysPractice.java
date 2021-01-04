import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int num[] = {15,60,3,2,5,1,4,8,6,7,9,10,13,11,14};

        //Bucle ForEach para recorrer un array
        for (int num2:
             num) {
            System.out.println("Indice = " + num2);
        }
        //Para ordenar el array de menor a mayor.
        Arrays.sort(num);
        for (int i = 0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
