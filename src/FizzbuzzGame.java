public class FizzbuzzGame {
    /*
    Escribe, en el lenguaje de programación que desees, un programa que muestre en pantalla los números del 1 al 100,
    sustituyendo los múltiplos de 3 por el palabro “Fizz” y, a su vez, los múltiplos de 5 por “Buzz”.
    Para los guarismos que, al tiempo, son múltiplos de 3 y 5, utiliza el combinado “FizzBuzz”.
    */
    public static void main(String[] args) {
        for (int i =0; i<=100; i++){
           if ((i % 3 == 0) && (i % 5 == 0)){
               System.out.println("FizzBuzz");
           }
           else if (i % 3 == 0){
               System.out.println("Fizz");
           }
           else if (i % 5 == 0){
               System.out.println("Buzz");
           }
           else {
               System.out.println(i);
           }

        }
    }
}
