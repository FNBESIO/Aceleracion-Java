package Ejemplo_Herencia;

public abstract class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;


    public Persona() {
    }

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }


    public void metodo_herencia_persona(){
    	System.out.println("Ejecuntando metodo de Clase Padre");
    }

    public abstract void Saludar();
/*  Un 'método abstracto' solo puede existir en una clase abstracta. Obliga a las clases hijas a sobreescribir el método.
    Por este motivo no tiene cuerpo {}. Su función es indicar a las clases hijas que deben implementar y sobreescribir el
    método de forma obligatoria .
*/

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}