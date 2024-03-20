import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String color;
    private int ruedas;
    private List<Vehiculo> vehiculos;

    public Vehiculo() {
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
        this.vehiculos = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void agregarVehiculos(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void catalogar(List<Vehiculo> vehiculos, Integer... ruedas) {
        if (ruedas.length > 0) {
            int contador = 0;

            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.ruedas == ruedas[0]) {
                    imprimirInformacion(vehiculo);
                    contador++;
                }
            }
            System.out.println("Se han encontrado " + vehiculosConRuedas(vehiculos, ruedas[0]) + " vehículos con " + ruedas[0] + " ruedas");
        } else {
            System.out.println("Se han encontrado " + vehiculos.size() + " vehículos:");
            for (Vehiculo vehiculo : vehiculos) {
                imprimirInformacion(vehiculo);
            }
        }
    }

    private void imprimirInformacion(Vehiculo vehiculo) {
        System.out.println("Clase: " + vehiculo.getClass().getSimpleName() + ", " + "Color: " + vehiculo.color + ", " + "Ruedas: " + vehiculo.ruedas);
        if (vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            System.out.println("Cilindrada: " + coche.getCilindrada() + ", " + "Velocidad Máxima: " + coche.getVelocidad());
        } else if (vehiculo instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) vehiculo;
            System.out.println("Tipo de bicicleta: " + bicicleta.getTipo());
        } else if (vehiculo instanceof Camioneta) {
            Camioneta camioneta = (Camioneta) vehiculo;
            System.out.println("Carga en kg: " + camioneta.getCarga());
        } else if (vehiculo instanceof Motocicleta) {
            Motocicleta motocicleta = (Motocicleta) vehiculo;
            System.out.println("Cilindrada: " + motocicleta.getCilindrada() + ", " + "Velocidad Máxima: " + motocicleta.getVelocidad());
        }
    }

    private int vehiculosConRuedas(List<Vehiculo> vehiculos, int ruedas) {
        int contador = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.ruedas == ruedas) {
                contador++;
            }
        }
        return contador;
    }
}
