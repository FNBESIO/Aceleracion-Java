import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ● INGRESO DE TEXTO "":
        Scanner teclado = new Scanner(System.in);
        String txtIn;

        System.out.println("Ingrese Texto: ");
        txtIn = teclado.nextLine();

        System.out.println("Texto ingresado: " + txtIn);

        // ● INGRESO DE NÚMEROS "":
        int numIn;

        System.out.println("Ingrese Numero: ");
        numIn = teclado.nextInt();

        System.out.println("Numero ingresado: " + numIn);

        System.out.println("++numIn: " + ++numIn);
    }
}