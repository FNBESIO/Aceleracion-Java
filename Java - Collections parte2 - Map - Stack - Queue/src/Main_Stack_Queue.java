import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main_Stack_Queue {
    public static void main(String[] args) {
        //● Clase STACK - PILA (LIFO -  Last In First Out)
        System.out.println("● Clase STACK (PILA): ");
        System.out.println(". --- pilaAutos --- ");

        Stack<Auto> pilaAutos=new Stack<Auto>();
        // El método .push() apila un elemento.
        pilaAutos.push(new Auto("Fiat","Idea","Blanco"));
        pilaAutos.push(new Auto("Ford","Ka","Negro"));
        pilaAutos.push(new Auto("Peugeot","2008","Verde"));
        pilaAutos.push(new Auto("Renault","Clio","Rojo"));
        pilaAutos.forEach(System.out::println);
        System.out.println("pilaAutos.size(): "+ pilaAutos.size());

        // El Método .pop() desapila un elemento.
        System.out.println("Primer elemento en salir: " + pilaAutos.pop());
        System.out.println("pilaAutos.size(): "+pilaAutos.size());

        while(!pilaAutos.isEmpty()){
            System.out.println(pilaAutos.pop());
        }
        System.out.println("pilaAutos.size(): "+ pilaAutos.size());

        System.out.println("*************************************************");
        //● Interface QUEUE - COLA (FIFO - First In First Out)
         System.out.println("● Interface QUEUE (COLA): ");
        System.out.println(". --- colaAutos --- ");

        Queue<Auto> colaAutos=new ArrayDeque<Auto>();

        // El método .offer() encola un elemento
        colaAutos.offer(new Auto("Fiat","Idea","Blanco"));
        colaAutos.offer(new Auto("Ford","Ka","Negro"));
        colaAutos.offer(new Auto("Peugeot","2008","Verde"));
        colaAutos.offer(new Auto("Renault","Clio","Rojo"));
        colaAutos.forEach(System.out::println);
        System.out.println("colaAutos.size(): "+ colaAutos.size());

        // El método .poll() desencola un elemento
        System.out.println("Primer elemento en salir: " + colaAutos.poll());
        System.out.println("colaAutos.size(): "+ colaAutos.size());

        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll());
        }
        System.out.println("colaAutos.size(): "+ colaAutos.size());
        System.out.println("****************************************************");
    }
}