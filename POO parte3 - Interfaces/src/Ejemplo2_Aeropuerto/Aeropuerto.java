package Ejemplo2_Aeropuerto;

public class Aeropuerto {

    public void darPermisoDeAterrizar(Volador volador) {

        volador.aterrizar();
	/*  
	Se esta indicando como par�metro un objeto que tenga implementado la interface. Esto nos va a permitir poder acceder
	'gen�ricamente' a los m�todos declarados en la interfaz. Cualquier objeto instanciado desde una clase que implemente
	la interfaz sera compatible para ingresar como par�metro. Por definici�n este objeto tendra el m�todo de la interfaz
    sobreescritro (@Override). El comportamiento del m�todo depender� de la clase que haya instanciado al objeto.
    */

        // 	Se Castea el objeto interfaz para poder acceder a los miembros particulares de cada clase.
        if (volador instanceof AvionPrivado) {
            AvionPrivado av_pri = (AvionPrivado) volador;
            System.out.println("Licencia: " + av_pri.getLicencia());
        }

        if (volador instanceof AvionDePasajeros) {
            AvionDePasajeros av_pas = (AvionDePasajeros) volador;
            System.out.println("Aerolinea: " + av_pas.getAerolinea());
        }

        if (volador instanceof AvionDeCarga) {
            AvionDeCarga av_car = (AvionDeCarga) volador;
            System.out.println("Tipo: " + av_car.getTipo());
        }
    }
}
