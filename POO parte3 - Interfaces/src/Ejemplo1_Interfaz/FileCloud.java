package Ejemplo1_Interfaz;

public class FileCloud implements Interfaz_File {

    @Override
    public void saveArchivos(Archivo archivo) {
        System.out.println("Archivo enviado a NUBE");
    }

    @Override
    public String loadArchivos(Archivo archivo) {
        return "Recuperado desde NUBE: " + archivo.getDatos();
    }

}
