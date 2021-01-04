import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            //Agregar a un objeto properties
            Properties p = new Properties(System.getProperties());
            //Para actualizar las propiedades
            System.setProperties(p);
            p.load(archivo);
            System.getProperties().list(System.out);
        }catch (Exception e){
            System.out.println("No existe el archivo = " + e);
        }
    }
}
