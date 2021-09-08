public class Camion extends Vehiculo {
    public Camion(double combustible, double capacidadTanque, double consumo) {
        super(combustible, capacidadTanque, consumo);
    }

    public void recargar(double litros) {
        double currentTankSpace = this.capacidadTanque - this.combustible;
        if(currentTankSpace - litros < 0) {
            Main.logger.info("No  se  puede  reabastecer  el  tanque,  esta  lleno\n");
        } else {
            this.combustible += (litros * 0.95);
            Main.logger.info(String.format("La cantidad de combustible del vehiculo es: %.2f \n", this.combustible));
        }
    }
}