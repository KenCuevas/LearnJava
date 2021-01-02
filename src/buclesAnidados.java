import javax.swing.JOptionPane;
public class buclesAnidados {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Escribe el lado del cuadrado");
        int lado = Integer.parseInt(text);

        cuadrado(lado);
    }
    public static void cuadrado (int lado){
        int numeroAsteriscos=lado;

        //Dibujar la parte  de arriba del cuadrado
        for (int cont=0;numeroAsteriscos>cont;cont++){
            System.out.print("*");
        }
        System.out.println("");

        //Buble anidado para dibujar los asteriscos del medio

        for (int cont=1;(numeroAsteriscos-2)>=cont;cont++){
            System.out.print("*");
        //bucle para dibujar los espacions entre el primer y el ultimo asterisco

            for (int i=0;(numeroAsteriscos-2)>i;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        //Bucle para dibujar la parte de abajo del cuadrado
        for (int cont = 0; numeroAsteriscos>cont; cont++){
            System.out.print("*");
        }
    }
}
