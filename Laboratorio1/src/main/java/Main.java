import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Vehiculo automovil = new Automovil(10, 100, 0.9);
        Vehiculo camion = new Camion(10, 100, 1.6);
        // Polimorfismo ^
        //--------------EJEMPLO 1---------------
        automovil.viaje(4);
        //--------------EJEMPLO 2---------------
        automovil.viaje(12);
        //--------------EJEMPLO 3---------------
        camion.viaje(4);


        ////--------------EJEMPLO 4 (adicional)---------------
        //Si un veh́ıculo no puede viajar a la distancia dada, su combustible no cambia
        Vehiculo automovil2 = new Automovil(10, 100, 0.9);

        //Impresion de combustible y kilometros recorridos
        automovil2.viaje(4);

        //Impresion cuando esta lleno el tanque y no hay espacio suficiente en este
        automovil2.recargar(99);

        //Impresion cuando se realice el reabastecimiento de combustible.
        automovil2.recargar(3.6);

        //Si un veh́ıculo no puede viajar a la distancia dada, su combustible no cambia
        automovil2.viaje(12);

    }
}