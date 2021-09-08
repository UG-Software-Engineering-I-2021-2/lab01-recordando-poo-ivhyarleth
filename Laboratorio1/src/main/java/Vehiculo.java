public class Vehiculo {
    protected double combustible; // Cantidad de combustible
    protected double consumo;
    protected double capacidadTanque;

    protected Vehiculo(double combustible, double capacidadTanque, double consumo) {
        this.combustible = combustible;
        this.capacidadTanque = capacidadTanque;
        this.consumo = consumo;
    }

    public void setCombustible(double combustible_){
        combustible = combustible_;
    }

    public void setConsumo(double consumo_){
        consumo = consumo_;
    }

    public void setcapacidadTanque(double capacidadTanque_){
        capacidadTanque = capacidadTanque_;
    }

    public double getCombustible(){ //cantidad de combustible
        return combustible;
    }

    public double getConsumo(){
        return consumo;
    }

    public double getcapacidadTanque(){
        return capacidadTanque;
    }

    public void viaje(double km) {
        double combustibleConsumido = km * consumo;
        if(this.combustible - combustibleConsumido < 0) {
            // Impresion
            Main.logger.info("Vehiculo necesita reabastecimiento de combustible\n");
        } else {
            this.combustible -= combustibleConsumido;
            // Impresion
            Main.logger.info(String.format("Vehiculo viajó %.1f km y aun tiene %.2f de combustible.\n", km, this.combustible));
        }
    }

    public void recargar(double litros) {}
}