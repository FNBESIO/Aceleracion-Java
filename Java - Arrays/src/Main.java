public class Main {
    public static void main(String[] args) {

        System.out.println(". ARRAYS:");

        // EJEMPLO 1:
        String[] array1;
        array1 = new String[3];

        array1[0] = "posicion_1";
        array1[1] = "posicion_2";
        array1[2] = "posicion_3";

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // EJEMPLO 2:
        int[] array2 = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // EJEMPLO 3:
        String[] array_destino_copia = new String[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array_destino_copia[i] = array1[i] + " - COPIA";
        }

        for (String s : array_destino_copia) {
            System.out.println(s);
        }


    }
}