package EjercicioAnimales;

public class Perro extends Animal {
    private String raza;
    private int peso;

    public Perro(String raza, int peso) {
        this.raza = raza;
        this.peso = peso;
    }

    public Perro(String nombre, int edad, String genero, String raza, int peso) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    void informacion() {

        System.out.println("El nombre del perro es: " + this.getNombre());
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println("Es " + this.getGenero());
        System.out.println("Su raza es: " + raza);
        System.out.println("Pesa: " + peso + " kg");

    }
}
