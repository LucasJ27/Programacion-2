public class Tecnico extends Operario{
    private int horasExtras;
    public Tecnico(String nombre, String dni, int horasExtras) {
        super(nombre, dni);
        this.horasExtras = horasExtras;
    }
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    @Override
    public String toString() {
        String s = "El tecnico trabajo "+ horasExtras + " horas extras";
        return s;
    }
}
