public class Oficial extends Operario{
    private int cantidadHoras;

    public Oficial(String nombre, String dni, int cantidadHoras) {
        super(nombre, dni);
        this.cantidadHoras = cantidadHoras;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    @Override
    public String toString() {
        String s = "El oficial debe cumplir " + cantidadHoras + " horas semanales";
        return s;
    }
}
