package Ejemplo2_Aeropuerto;

public class Main_Aeropuerto {

	public static void main(String[] args) {
		
		System.out.println("---- volador1 ----");
        AvionPrivado v1 = new AvionPrivado("L123456F");
        System.out.println(v1);
        
        System.out.println("---- volador2 ----");
        AvionDePasajeros v2 = new AvionDePasajeros("Volando Alto");
        System.out.println(v2);

        System.out.println("---- volador3 ----");
        AvionDeCarga v3 = new AvionDeCarga();
        v3.setTipo("A");
        System.out.println(v3);
        
        System.out.println(". PISTA DE ATERRIZAJE: ");
        Aeropuerto aeropuerto1 = new Aeropuerto();

        aeropuerto1.darPermisoDeAterrizar(v1);
        aeropuerto1.darPermisoDeAterrizar(v2);
        aeropuerto1.darPermisoDeAterrizar(v3);

	}

}
