package EjercicioAnimales;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Rocco",12,"Macho","Bulldog Ingles",20);
        System.out.println("\n");
        perro1.informacion();
        perro1.hacerSonido();

        System.out.println("\n");
        Gato gato1 = new Gato("Garfield",15,"Macho","Negro");
        gato1.informacion();
        gato1.hacerSonido();

        System.out.println("\n");
        Pajaro pajaro1 = new Pajaro("Luci",3,"Hembra","Plumaje fino");
        pajaro1.informacion();
        pajaro1.hacerSonido();
    }
}
