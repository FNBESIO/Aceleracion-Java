import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main_Set {
    public static void main(String[] args) {
        System.out.println("● INTERFACE SET");
        System.out.println(". HashSet: NO se admiten elementos duplicados y NO se garantiza mantener el orden de ingreso");
        System.out.println(". --- set1_HashSet ---");
        Set<Object> set1_HashSet = new HashSet<Object>();

        set1_HashSet.add(1);
        set1_HashSet.add("Hola Universo");
        set1_HashSet.add("Hola Universo"); // no se agrega.
        set1_HashSet.add("Hola Galaxia");
        set1_HashSet.add("Hola Mundo");
        set1_HashSet.add(1); // no se agrega.
        set1_HashSet.add(8);
        System.out.println(set1_HashSet);
        System.out.println(set1_HashSet.size());

        System.out.println(". --- set2_HashSet ---");
        Set<String> set2_HashSet = new HashSet<String>();
        set2_HashSet.add("Lunes");
        set2_HashSet.add("Martes");
        set2_HashSet.add("Lunes"); // no se agrega.
        set2_HashSet.add("Miercoles");
        set2_HashSet.add("Jueves");
        set2_HashSet.add("Viernes");
        set2_HashSet.forEach(System.out::println);

        System.out.println(". Elementos duplicados, con Objetos de Clases Propias. Desde HashSet pero Idem TreeSet.");
        System.out.println(". --- auto_Hash ---");
        HashSet<Auto> auto_Hash = new HashSet<Auto>();

        Auto auto8 = new Auto("Auto8", "Auto8", "Auto8");
        Auto auto8_prueba = new Auto("Auto8", "Auto8", "Auto8");

        System.out.println("auto8.hashCode(): " + auto8.hashCode());                  // Tienen el mismo codigo Hash.
        System.out.println("auto8_prueba.hashCode(): " + auto8_prueba.hashCode());

        auto_Hash.add(auto8);
        auto_Hash.add(auto8_prueba);        //no lo agrega.
        System.out.println(auto_Hash);
        System.out.println("set4.size(): " + auto_Hash.size());


        System.out.println(". LinkedHashSet: NO se admiten Elementos Duplicados pero SI se garantiza el orden de ingreso");
        System.out.println(". --- set2_LinkedHashSet ---");
        Set<String> set2_LinkedHashSet = new LinkedHashSet<String>();

        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Martes");
        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Miercoles");
        set2_LinkedHashSet.add("Jueves");
        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Viernes");
        set2_LinkedHashSet.forEach(System.out::println);


        System.out.println(". TreeSet: NO se admiten Elementos Duplicados, y ordena los elementos por orden alfabético.");
        System.out.println("--- set1_TreeSet <String> ---");
        Set<String> set1_TreeSet = new TreeSet<String>();
        set1_TreeSet.add("Miercoles");
        set1_TreeSet.add("Lunes");
        set1_TreeSet.add("Martes");
        set1_TreeSet.add("Jueves");
        set1_TreeSet.add("Lunes");
        set1_TreeSet.add("Viernes");
        set1_TreeSet.forEach(System.out::println);

        System.out.println("--- set3_TreeSet <Integer> ---");
        Set<Integer> set3_TreeSet = new TreeSet<Integer>();
        set3_TreeSet.add(8);
        set3_TreeSet.add(16);
        set3_TreeSet.add(10);
        set3_TreeSet.add(9);
        set3_TreeSet.add(11);
        set3_TreeSet.add(32);
        set3_TreeSet.add(24);
        set3_TreeSet.forEach(System.out::println);


        System.out.println(". DecimalFormat(): ");
        int edad1 = 9;
        int edad2 = 12;
        int edad3 = 123;
        int edad4 = 1234;

        DecimalFormat dfEdad = new DecimalFormat("000");
        System.out.println("edad1 : " + dfEdad.format(edad1));
        System.out.println("edad2 : " + dfEdad.format(edad2));
        System.out.println("edad3 : " + dfEdad.format(edad3));
        System.out.println("edad4 : " + dfEdad.format(edad4));

        int millon = 1000000;
        DecimalFormat dfMillon_conDecimal = new DecimalFormat("###,###,###.00");
        System.out.println("millon : " + dfMillon_conDecimal.format(millon));
    }
}
