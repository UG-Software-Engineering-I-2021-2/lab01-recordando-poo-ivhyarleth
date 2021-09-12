package Vehiculo;

public abstract class Vehiculo {
    protected double combustible; // Cantidad de combustible
    protected double consumo;
    protected double capacidadTanque;

    protected Vehiculo(double combustible, double capacidadTanque, double consumo) {
        this.combustible = combustible;
        this.capacidadTanque = capacidadTanque;
        this.consumo = consumo;
    }

    public void setCombustible(double combustible0){
        combustible = combustible0;
    }

    public void setConsumo(double consumo0){
        consumo = consumo0;
    }

    public void setcapacidadTanque(double capacidadTanque0){
        capacidadTanque = capacidadTanque0;
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

    public String viaje(double km) {
        double combustibleConsumido = km * consumo;
        if(this.combustible - combustibleConsumido < 0) {
            // Impresion
            return "Vehiculo necesita reabastecimiento de combustible";
        } else {
            this.combustible -= combustibleConsumido;
            // Impresion
            return ("Vehiculo viajó " + String.format("%.1f", km) + " km y aún tiene " + String.format("%.2f", this.combustible)+ " de combustible");
        }
    }

    public abstract String recargar(double litros);
}
