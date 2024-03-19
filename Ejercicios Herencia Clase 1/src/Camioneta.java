public class Camioneta extends Vehiculo{
    private float carga;

    public Camioneta() {
    }

    public Camioneta(float carga) {
        this.carga = carga;
    }

    public Camioneta(String color, int ruedas, float carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
}
