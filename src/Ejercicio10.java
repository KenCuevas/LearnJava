public class Ejercicio10 {
        /*
     Del siguiente String “La lluvia en Sevilla es una maravilla”
     cuenta cuantas vocales hay en total (recorre el String con charAt).

     Reemplaza todas las a del String anterior por una e.
     */
        public static void main(String[] args) {
            String oracion = ("La lluvia en Sevilla es una maravilla");
            String sustituirOracion = oracion.replace('a', 'e');
            System.out.println(sustituirOracion);
        }
}
