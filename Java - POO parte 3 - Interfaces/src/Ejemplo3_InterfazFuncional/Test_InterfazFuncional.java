package Ejemplo3_InterfazFuncional;

public class Test_InterfazFuncional {

    public static void main(String[] args) {

        System.out.println("-------- in_fun1 --------");

        Interfaz_Funcional in_fun1 = (name) -> "Hola " + name;
        System.out.println(in_fun1.metodo_abst("Juan Rosales"));

        System.out.println(in_fun1.metodo_default1());
        System.out.println(in_fun1.metodo_default2());
        System.out.println(in_fun1.metodo_default3());

    }

}
