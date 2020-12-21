public class ConversionDeTipos {
    public static void main(String[] args) {

        //Convertir string a numeros
        String convertirStr = "506";

        int numeroInt = Integer.parseInt(convertirStr);
        System.out.println("Numero convertido es: " + numeroInt);

        //Convertir un string a un double

        String doubleStr = "124587.23";

        double realDouble = Double.parseDouble(doubleStr);
        System.out.println(realDouble);

        //Convertir string a boolean

        String booleanStr = "false";

        boolean realBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println(realBoolean);

    }
}
