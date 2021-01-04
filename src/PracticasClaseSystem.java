import java.util.Properties;

public class PracticasClaseSystem {
    public static void main(String[] args) {
        //Este metodo nos envia el nombre de usuario de nuestra maquina.
        String osUsername = System.getProperty("user.name");
        System.out.println("osUsername = " + osUsername);

        //Este metodo nos envia la ruta del usuario en el OS
        String homeDir = System.getProperty("user.home");
        System.out.println("homeDir = " + homeDir);

        //Este metodo nos da la direccion del espacio de trabajo en el que estamos
        String espacioDeTrabajo = System.getProperty("user.dir");
        System.out.println("espacioDeTrabajo = " + espacioDeTrabajo);

        //Metodo para obtener la version de Java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        //Obtener toda la documentacion
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
