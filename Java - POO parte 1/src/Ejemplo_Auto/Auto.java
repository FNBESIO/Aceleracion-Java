package Ejemplo_Auto;

public class Auto {
	
	// ATRIBUTOS
    public String marca;
    public String modelo;
    public String color;
    public int velocidad;
	
    
    // CONSTRUCTORES
    public Auto() {
		
	}
    
    public Auto(String marca, String modelo, String color, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}
    
    
    // MÉTODOS
    public void acelerar(){
        velocidad+=10;      
        if(velocidad>100) velocidad=100;
    }


    public void frenar(){
        velocidad-=10;      
        if(velocidad<0) velocidad=0;
    }

    public int obtenerVelocidad(){
        return velocidad;           
    }


    public String getEstado(){
        return marca+" "+modelo+" "+color+", "+velocidad;
    }

	
    }
