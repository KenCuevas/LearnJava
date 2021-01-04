package Proyectos;

public class BubbleSort {
    public static void bubblesort(Object [] arreglo){
        int totales = arreglo.length;
        int contador = 0;
        for (int i = 0; i < totales - 1; i++ ){

            for (int j = 0; j < totales -1 -i; j++){
                if( ( (Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ){ //if( ((Integer)numero[j+1]).compareTo(numero[j])<0) opcion sin pasar a Integer
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contador++;
            }
        }
        System.out.println("Contador = " + contador);
    }
    public static void main(String[] args) {
        String [] Productos = {"Television", "Nevera", "Microondas", "Laptop", "Xbox One S", "Playstation 4"};
        Integer[] numero = {100,350,1,8,7,600,15,4,160,2,60,3,89,74,52,5,99,836,601,844,6,9};
            bubblesort(Productos);
            bubblesort(numero);
        for (String producto : Productos) {
            System.out.println(producto);
        }
        for (Integer integer : numero) {
            System.out.println(integer);
        }
        /*
        //Utilizamos el metodo length para saber la longitud del array
        int cadenaTotal = Productos.length;

        //Necesitamos dos ciclos for, ya que el primero realiza el recorrido de cada elemento y el segundo compara cada elemento con cada uno.
        for (int i = 0; i < cadenaTotal;i++){
            for (int j = 0; j < cadenaTotal; j++){
                //Compara cada elemento del I con el del J, verifica que el valor que tenga i esta en un nivel mas bajo que el que esta en J en la tabla Unicode y luego intercambiamos la posicion
                if(Productos[i].compareTo(Productos[j])<0){
                    String aux = Productos[i];//Esta variable es porque primero asigno los valores de I a J y puede dar error al momento de darle la posicion de J.
                    Productos[i] = Productos[j];
                    Productos[j] = aux;
                }
                contador++;
            }
        }
        */
    }
}
