import Ejemplo_Auto.Auto;
import Ejemplo_Auto.Auto_Encapsulado;
import Ejemplo_Cuenta.ClientePersona;
import Ejemplo_Cuenta.Cuenta;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("Class AUTO: ");
        Auto auto1=new Auto();
        auto1.marca="Fiat";
        auto1.modelo="Cronos";
        auto1.color="Rojo";
        auto1.acelerar();       //10
        auto1.acelerar();       //20
        auto1.acelerar();       //30
        auto1.frenar();         //20
        System.out.println("auto1.velocidad = " + auto1.velocidad);
        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);

        System.out.println("Class AUTO_ENCAPSULADO: ");
        Auto_Encapsulado auto_e1 = new Auto_Encapsulado();
        auto_e1.setColor ("Negro");
        auto_e1.setMarca ("HONDA");
        auto_e1.setModelo("CIVIC");
        auto_e1.setVelocidad(0);
        System.out.println(auto_e1.getEstado());
        auto_e1.setVelocidad(100);
        System.out.println(auto_e1.getEstado());

        System.out.println("*********************************************");
        System.out.println("Class CUENTA: ");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(80000);
        cuenta1.depositar(160000); //240000
        cuenta1.debitar(25000);	   //215000
        System.out.println("- cuenta1: " + cuenta1);

        Cuenta cuenta2=new Cuenta(2,"arg$");
        cuenta2.depositar(350000);
        System.out.println("- cuenta2: " + cuenta2);

        System.out.println("Class CLIENTE PERSONA: ");
        ClientePersona clientePersona1=new ClientePersona(1,"Andres",24,cuenta1);
        clientePersona1.getCuenta().depositar(25000); //240000
        clientePersona1.getCuenta().debitar(10000);   //230000
        System.out.println(clientePersona1);
        System.out.println(cuenta1);
        clientePersona1.comprar();
    }
}