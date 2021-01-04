package Proyectos;

public class BubbleSort {
    public static void main(String[] args) {
        String [] Productos = {"Television", "Nevera", "Microondas", "Laptop", "Xbox One S", "Playstation 4"};

        //Utilizamos el metodo length para saber la longitud del array
        int cadenaTotal = Productos.length;
        int contador = 0;
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
        System.out.println("El algoritmo ha contado un total de: " + contador);
    }
}
