public class Ejercicio9 {
    /*
     Del siguiente String “La lluvia en Sevilla es una maravilla”
     cuenta cuantas vocales hay en total (recorre el String con charAt).
     */

    public static void main(String[] args) {
        String oracion = ("La lluvia en Sevilla es una maravilla");
        int contar = 0;

        for (int i=0; i<oracion.length(); i++){
            if (oracion.charAt(i) == 'a' ||
            oracion.charAt(i)== 'e' ||
            oracion.charAt(i)== 'i' ||
            oracion.charAt(i)== 'o' ||
            oracion.charAt(i)== 'u'){
                contar++;
            }
        }
        System.out.println(contar);
    }
}
