package EjercicioAnimales;

public class Pajaro extends Animal {
    private String plumaje;

    public Pajaro(String plumaje) {
        this.plumaje = plumaje;
    }

    public Pajaro(String nombre, int edad, String genero, String plumaje) {
        super(nombre, edad, genero);
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    void hacerSonido() {
        System.out.println("Pio pio");
    }

    @Override
    void informacion() {
        System.out.println("El nombre del pajaro es: " + this.getNombre());
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println("Es " + this.getGenero());
        System.out.println("Su plumaje es: " + plumaje);
    }
}
