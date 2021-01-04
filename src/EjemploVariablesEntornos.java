import java.util.Map;

public class EjemploVariablesEntornos {
    public static void main(String[] args) {
        //Obtenemos las variables de ambiente de entorno donde nos dan los nombres de todas las necesarias para el sistema
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        //obtener una sola
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        //Segunda manera de acceder usando el mapa se debe tener cuidado al momente de poner el key ya que los maps son estrictos ocn minisculas y mayuscula si ponemos path en mayuscula lanza null
        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);
    //Recorriendo el mapa
        System.out.println("----Listando las variasbles del sistema-----");
        for (String key: varEnv.keySet()){
            System.out.println(key + " >= " + varEnv.get(key));
        }
    }
}
