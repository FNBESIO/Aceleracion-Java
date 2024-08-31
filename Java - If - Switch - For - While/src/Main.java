import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("● ESTRUCTURA DE CONTROL DE FLUJO: 'CONDICIONALES'");
        System.out.println("• CONDICIONAL 'IF':");

        byte num = 15, num2 = 25;

        if (num < 20) {
            System.out.println("TRUE - num es menor que 20"); // Al cumplirse la condicion se ejecuta el comando indicado para la condicion 'True'.
        }
        System.out.println("Sentencia fuera del 'if'");


        System.out.println("• CONDICIONAL 'IF ELSE':");
        if (num2 < 20) {
            System.out.println("sentenciaTRUE");
        } else {
            System.out.println("sentenciaFALSE");
        }


        System.out.println("• CONDICIONAL 'ELSE IF':");
        byte x = 20;

        if (x == 10) {
            System.out.println("DIEZ");
        } else if (x == 20) {
            System.out.println("VEINTE");
        } else if (x == 30) {
            System.out.println("TREINTA");
        } else {
            System.out.println("NINGUNO");
        }

        System.out.println(".ESTRUCTURA SWITCH");
        System.out.println(". Ejemplo A: ");

        byte num_switch;

        num_switch = 8;

        switch (num_switch) {
            case 10:
                System.out.println("DIEZ");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

        System.out.println(". Ejemplo B:");
        String string_switch = "Hola Mundo!";

        switch (string_switch) {
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
            case "Hola Mundo!":
                System.out.println("switch - case Hola Mundo!");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

        System.out.println(". Ejemplo C:");
        string_switch = "c";

        switch (string_switch) {                              // Se pueden agrupar dos condiciones para una misma sentencia.
            case "a":
            case "b":
                System.out.println("a o b");
                break;
            case "c":
            case "d":
                System.out.println("c o d");
                break;
            case "e":
            case "f":
                System.out.println("e o f");
                break;
            case "g":
                System.out.println("g");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

        System.out.println("Ejemplo D: ");
        byte x_sw;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero: ");
        x_sw = teclado.nextByte();

        switch (x_sw) {
            case 10:
                System.out.println("DIEZ");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }

    }
}