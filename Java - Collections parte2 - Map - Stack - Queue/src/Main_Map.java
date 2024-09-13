import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_Map {
    public static void main(String[] args) {
        System.out.println("● Interface MAP ");
        System.out.println("• HashMap: No conserva el orden de ingreso, pero es mas veloz.");
        Map<String, String> map = new HashMap<String, String>();
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");
        map.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println(". map.get(vi): " + map.get("vi"));

        //. Ejemplo de cambio de idioma, conservando la misma Clave.
        Map<String, String> map_english = new HashMap<String, String>();
        map_english.put("lu", "Monday");
        map_english.put("ma", "Tuesday");
        map_english.put("mi", "Wednesday");
        map_english.put("ju", "Thursday");
        map_english.put("vi", "Friday");
        map_english.put("sa", "Saturday");
        map_english.put("do", "Sunday");

        map.putAll(map_english);
        map.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println(". map.get(vi): " + map.get("vi"));

        System.out.println();
        System.out.println(". Clases propias como claves)");
        Map<Auto, String> map_ClasePropia = new HashMap<Auto, String>();
        Auto auto1 = new Auto("Renault", "Duster", "Azul");
        Auto auto2 = new Auto("Volkswagen", "Fox", "Gris");
        Auto auto3 = new Auto("Peugeot", "206", "Negro");
        Auto auto4 = new Auto("Toyota", "Etios", "Blanco");

        map_ClasePropia.put(auto1, "personaA");
        map_ClasePropia.put(auto2, "personaB");
        map_ClasePropia.put(auto3, "personaC");
        map_ClasePropia.put(auto4, "personaD");

        map_ClasePropia.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println(map_ClasePropia.get(auto2));
        System.out.println("****************************************************");
        System.out.println("•LinkedHashMap: Conserva el orden de ingreso.");

        map = new LinkedHashMap<String, String>();
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");

        map.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("****************************************************");
        System.out.println("• TreeMap");
        System.out.println(". ORDEN NATURAL de claves (alfabético):");
        // Almacena en una estructura tipo arbol por ORDEN NATURAL de claves (alfabético) o ALTERNATIVO (definido).
        // Si se utiliza una Clase propia como Clave, la misma debera implementar la Interface Comparable.

        map = new TreeMap<String, String>();
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");

        map.forEach((k, v) -> System.out.println(k + " - " + v));

         System.out.println(". ORDEN ALTERNATIVO de claves (clases propias):");
        //Necesita que la Clase implemente Comparable, porque tiene que definir un orden.
        map_ClasePropia = new TreeMap<Auto, String>();
        map_ClasePropia.put(auto1, "personaA");
        map_ClasePropia.put(auto2, "personaB");
        map_ClasePropia.put(auto3, "personaC");
        map_ClasePropia.put(auto4, "personaD");

        map_ClasePropia.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
