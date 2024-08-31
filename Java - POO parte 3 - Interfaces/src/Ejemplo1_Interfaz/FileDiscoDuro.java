package Ejemplo1_Interfaz;

public class FileDiscoDuro implements Interfaz_File {

    @Override
    public void saveArchivos(Archivo archivo) {
        System.out.println("Archivo enviado a DISCO DURO");
    }

    @Override
    public String loadArchivos(Archivo archivo) {
        return "Recuperado desde DISCO DURO: " + archivo.getDatos();

    }

}
