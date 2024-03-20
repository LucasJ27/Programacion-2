//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Lucas");
        System.out.println(empleado1.toString());

        Operario operario1 = new Operario("Lucas","38756526");
        System.out.println(operario1.toString());

        Directivo directivo1 = new Directivo("Walter","Logistica");
        System.out.println(directivo1.toString());

        Oficial oficial1 = new Oficial("Facundo","39888757",50);
        System.out.println(oficial1.toString());

        Tecnico tecnico1 = new Tecnico("Dante","40834333",15);
        System.out.println(tecnico1.toString());

    }

}