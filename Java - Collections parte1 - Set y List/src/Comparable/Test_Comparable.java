package Comparable;
import java.util.Set;
import java.util.TreeSet;

public class Test_Comparable {

	public static void main(String[] args) {
 
		//. Orden de los elementos con objetos de Clases propias.
		System.out.println(". --- set2_TreeSet <Auto> ---");
        Set<Auto2> set_TreeSet = new TreeSet<Auto2>();
        set_TreeSet.add(new Auto2("Peugeot","Partner","Azul"));
        set_TreeSet.add(new Auto2("Citroen","C4","Bordo"));
        set_TreeSet.add(new Auto2("FIAT", "UNO", "Gris"));
        set_TreeSet.add(new Auto2("Citroen","Berlingo","Negro"));
        set_TreeSet.forEach(System.out::println);

    }

}


