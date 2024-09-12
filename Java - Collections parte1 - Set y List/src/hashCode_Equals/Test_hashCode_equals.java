package hashCode_Equals;

import java.util.HashSet;
import java.util.Set;

public class Test_hashCode_equals {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Juan", 25);
        Persona persona3 = new Persona("Maria", 30);

        System.out.println(persona1.equals(persona2)); // true, porque tienen el mismo nombre y edad
        System.out.println(persona1.equals(persona3)); // false, porque son diferentes

        Set<Persona> personas = new HashSet<>();
        personas.add(persona1);
        personas.add(persona2); // No será agregada porque es igual a persona1
        personas.add(persona3);

        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }
}
