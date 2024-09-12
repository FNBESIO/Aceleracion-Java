package hashCode_Equals;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica si el objeto comparado es el mismo que el actual
        if (this == obj) return true;

        // Verifica si el objeto es null o no es de la misma clase
        if (obj == null || getClass() != obj.getClass()) return false;

        // Realiza un casting para comparar los atributos relevantes
        Persona persona = (Persona) obj;

        // Compara los atributos relevantes
        if (edad != persona.edad) return false;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        // Implementa hashCode de manera consistente con equals
        int result = nombre.hashCode();
        result = 31 * result + edad;
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
