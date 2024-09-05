public class Main_Casteo {
    public static void main(String[] args) {
        System.out.println("● STATIC");
        System.out.println(Clase_Estatica.atributo_estatico);
        Clase_Estatica.metodo_Estatico();

        System.out.println("● Casteo Implicito");
        // 	Un byte es el elemento numerico mas pequeño en Java, por lo tanto se puede pasar a cualquier 'contenedor', y así sucesivamente.
        byte miByte = 37;

        short miShort = miByte;

        int miInt = miShort;

        long miLong = miInt;

        float miFloat = miLong;

        double miDouble = miFloat;
        System.out.println(miByte);
        System.out.println(miDouble);


        // ● Casteo Explicito
        System.out.println("● Casteo Explicito");
        System.out.println(". Ejemplo 1:");
        // un double el elemento numerico mas grande en Java
        double miDouble2 = 2.9856;
        System.out.println("miDouble2 = " + miDouble2);

        float miFloat2 = (float) miDouble2;
        System.out.println("miFloat2 = " + miFloat2);

        long miLong2 = (long) miFloat2;
        System.out.println("miLong2 = " + miLong2);

        int miInt2 = (int) miLong2;
        System.out.println("miInt2 = " + miInt2);


        short miShort2 = (short) miInt2;
        System.out.println("miShort2 = " + miShort2);

        byte miByte2 = (byte) miShort2;
        System.out.println("miByte2 = " + miByte2);

        System.out.println(". Ejemplo 2:");
        //Define una variable del tipo int con el valor 250
        int numeroEntero = 250;
        System.out.println("numeroEntero= " + numeroEntero);
        //Define una variable del tipo short y se castea la variable numeroEntero, asegurando que la conversion sera posible.
        short s = (short) numeroEntero;
        System.out.println("s: " + s);

        //Si se castea Datos incompatibles, no dara un error en tiempo de compilación pero arojarra valores erroroneos.

        int numeroEntero2 = 250000000;
        System.out.println("numeroEntero2= " + numeroEntero2);
        short s2 = (short) numeroEntero2;
        System.out.println("s2 (con dato fuera de alcance): " + s2);
    }
}