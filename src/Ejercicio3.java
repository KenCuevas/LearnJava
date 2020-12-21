public class Ejercicio3 {
    public static void main(String[] args) {
        //Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

        /** Creamos una variable inicial y le asignamos el valor de 0**/
        int numeroUno = 0;

        /** En el buble while le decimos que mientras
         * nuestra variable sea menor que cien que imprima lo que le pedimos*/
        while (numeroUno < 100) {
            /**Aqui le decimos que mientras cumpla la */
            System.out.println("Numero: " + (numeroUno += 1));
        }
    }
}
