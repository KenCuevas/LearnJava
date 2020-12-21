public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
         */
        int numeroEjemplo = 100;
        for (int index = 0; index <= 100; index++){
            if(index % 2 == 0 || index % 3 == 0){
                System.out.println(index);
            }
        }
    }
}
