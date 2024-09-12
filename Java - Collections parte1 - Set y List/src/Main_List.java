import java.util.ArrayList;
import java.util.List;

public class Main_List {
    public static void main(String[] args) {
        System.out.println("● INTERFACE LIST & GENERICS");

        Auto auto1 = new Auto("FIAT", "PALIO", "NEGRO");

        List<Object> lista1 = new ArrayList<Object>();

        lista1.add(auto1);
        lista1.add(new Auto("VOLSWAGEN", "GOLF", "NEGRO"));
        lista1.add(new Auto("RENAULT", "SANDERO", "NARANJA"));
        lista1.add(new Auto("FIAT", "UNO", "GRIS"));
        lista1.add("Hola Mundo");
        lista1.add(8);
        lista1.add("Hola Mundo prueba2");
        lista1.add("Hola Mundo prueba3");
        lista1.remove(3);
        lista1.add(2, "Hola Mundo Posicion 2");           // Ingresa el dato entre la posicion en "1" y el "2"
        lista1.remove("Hola Mundo prueba2");                        // Va a borrar el dato que coincida "Hola Mundo prueba2".

        System.out.println(". --- lista1 ---");
        System.out.println(lista1.get(0));
        System.out.println(lista1.get(1));
        System.out.println(lista1.get(2));
        System.out.println(lista1.get(3));
        System.out.println(lista1.get(4));
        System.out.println(lista1.get(5));
        System.out.println(lista1.get(6));

        System.out.println("lista1.size(): " + lista1.size());          // Devuelve el tamaño de lista1
        System.out.println("lista1.isEmpty(): " + lista1.isEmpty());
        System.out.println("lista1.indexOf(Hola Mundo): " + lista1.indexOf("Hola Mundo"));
        System.out.println("lista1.indexOf(8): " + lista1.indexOf(8));
        System.out.println("lista1.indexOf(new Auto (VOLSWAGEN, GOLF,  NEGRO): " + lista1.indexOf(new Auto
                ("VOLSWAGEN", "GOLF", "NEGRO")));
        for (Object i : lista1) System.out.println(i);

        System.out.println(". GENERICS:");
        List<Auto> lista2 = new ArrayList<Auto>();
        // <Auto> se indica que la Lista es del tipo AUTO, es decir, solo se podrán agregar Objetos de la Clase Auto.
        lista2.add(new Auto("Citroen", "C4", "Bordo"));
        lista2.add(new Auto("FIAT", "UNO", "GRIS"));
        lista2.add(new Auto("Citroen", "Berlingo", "Negro"));
        System.out.println(". --- lista2 ---");
        lista2.forEach(System.out::println);

        System.out.println(". Copiar Objetos de una Lista a otra: ");
        System.out.println(". --- nueva lista2 ---");
        lista1.forEach(element -> {
            if (element instanceof Auto) lista2.add((Auto) element);
            // Si no se agrega el if se corre el riesgo de Castear datos incompatibles y que nos de error en tiempo de ejecución.
            // En este caso como lista1 es del tipo Object, nos aseguramos de copiar a lista2 únicamente aquellos objetos del tipo Auto
        });
        lista2.forEach(System.out::println);

        System.out.println(". --- lista3 ---");
        List<String> lista3 = new ArrayList<String>();
        lista1.forEach(o -> {
            if (o instanceof String) lista3.add((String) o);
        });
        lista3.forEach(System.out::println);

        System.out.println(". --- lista4 ---");
        List<Integer> lista4 = new ArrayList<Integer>();
        lista1.forEach(o -> {
            if (o instanceof Integer) lista4.add((Integer) o);
        });
        lista4.forEach(System.out::println);

        System.out.println("*************************************************");
    }
}