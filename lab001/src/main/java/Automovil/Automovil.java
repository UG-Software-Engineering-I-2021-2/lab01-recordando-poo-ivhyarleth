package Automovil;
import Vehiculo.Vehiculo;

public class Automovil extends Vehiculo {
    public Automovil (double combustible, double capacidadTanque, double consumo) {
        super(combustible, capacidadTanque, consumo);
    }

    @Override
    public String recargar(double litros) {
        double currentTankSpace = this.capacidadTanque - this.combustible;
        if(currentTankSpace - litros < 0) {
            return ("No  se  puede  reabastecer  el  tanque,  esta  lleno");
        }
        else {
            this.combustible += litros;
            return String.format("La cantidad de combustible del automovil es: %.1f", this.combustible);
        }
    }
}