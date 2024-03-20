package EjercicioAnimales;

public class Gato extends Animal{

    private String color;

    public Gato(String color) {
        this.color = color;
    }

    public Gato(String nombre, int edad, String genero, String color) {
        super(nombre, edad, genero);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void hacerSonido() {
        System.out.println("Miau miau");
    }

    @Override
    void informacion() {
        System.out.println("El nombre del gato es: " + this.getNombre());
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println("Es " + this.getGenero());
        System.out.println("Su color es: " + color);
    }
}
