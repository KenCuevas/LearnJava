public class EjemploEjecutarProgramasSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").startsWith("Windows")){
                proceso = rt.exec("notepad");
            } else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (Exception e){
            System.err.println("Comando desconocido" + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }

}
