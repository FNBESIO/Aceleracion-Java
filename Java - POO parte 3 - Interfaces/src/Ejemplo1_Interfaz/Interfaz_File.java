package Ejemplo1_Interfaz;

public interface Interfaz_File {

	void saveArchivos(Archivo archivo);
	
	String loadArchivos(Archivo archivo);
    
    default void info(){
        System.out.println("Hola desde Metodo default - Interface I_File");
    } 
	
}
