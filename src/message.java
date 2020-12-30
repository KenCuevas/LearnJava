import java.text.NumberFormat;
import java.util.Arrays;

public class message {
    public static void main(String[] args) {
        /**String  password = "hola mundo como estan soy kenny cuevas";

         System.out.println(password.trim());*/

        /** Arrays /
         int [] numbers = {10, 3, 27, 30, 21};
         Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));*/

        /** Arrays Multidimensionales
         int [][] numbers = {{1,3,4,2} , {5,8,7,6}};
         System.out.println(Arrays.deepToString(numbers));**/
/*
        int[] testReverse = {800462};
        Arrays.sort(testReverse);
        System.out.println(Arrays.toString(testReverse));
*/
        NumberFormat percent = NumberFormat.getPercentInstance();

        String result = percent.format(0.2);

        System.out.println(result);

    }
}