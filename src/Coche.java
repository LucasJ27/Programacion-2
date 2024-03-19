public class Coche extends Vehiculo {
    private String velocidad;
    private String cilindrada;

    public Coche() {
    }

    public Coche(String velocidad, String cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Coche(String color, int ruedas, String velocidad, String cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
