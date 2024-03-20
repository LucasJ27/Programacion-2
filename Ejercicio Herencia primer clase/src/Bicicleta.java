public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
