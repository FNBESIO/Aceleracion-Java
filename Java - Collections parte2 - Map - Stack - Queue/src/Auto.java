public class Auto implements Comparable<Auto> {

    private String marca;
    private String modelo;
    private String color;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public int compareTo(Auto auto) {
        String thisAuto = this.getMarca() + "," + this.getModelo() + "," + this.getColor();
        String paraAuto = auto.getMarca() + "," + auto.getModelo() + "," + auto.getColor(); //para => parametro
        return thisAuto.compareToIgnoreCase(paraAuto);
    }


    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}