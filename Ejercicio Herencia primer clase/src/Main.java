import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(); //Instanciamos la clase vehiculo para poder utilizar la funcion catalogar creada dentro de la clase vehiculo
        List<Vehiculo> vehiculos = new ArrayList<>();

        Coche auto1 = new Coche("Rojo",4,"180km/h","2000cc");
        Bicicleta bici1 = new Bicicleta("Verde",2,"Urbana");
        Camioneta camioneta1 = new Camioneta("Negra",4,2500);
        Motocicleta moto1 = new Motocicleta("Azul",2,"200km/h","1200cc");

        vehiculos.add(auto1);
        vehiculos.add(bici1);
        vehiculos.add(camioneta1);
        vehiculos.add(moto1);

        // Invocamos catalogar() sin filtro de ruedas
        System.out.println("\nLISTA COMPLETA DE VEHICULOS");
        vehiculo.catalogar(vehiculos);

        // Invocamos catalogar() con filtro de ruedas (0, 2 y 4 ruedas)
        System.out.println("\nVehículos con 0 ruedas:");

        vehiculo.catalogar(vehiculos,0);

        System.out.println("\nVehículos con 2 ruedas:");
        vehiculo.catalogar(vehiculos,2);

        System.out.println("\nVehículos con 4 ruedas:");
        vehiculo.catalogar(vehiculos,4);
        }
    }
