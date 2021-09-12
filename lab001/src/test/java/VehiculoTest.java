import org.testng.Assert;
import org.testng.annotations.Test;


import Vehiculo.Vehiculo;
import Camion.Camion;
import Automovil.Automovil;

public class VehiculoTest {

    //Ejemplos de outputs:
    @Test()
    public void test01(){
        Vehiculo toyota = new Automovil(10,100,0.9);
        Assert.assertEquals( toyota.viaje(4), "Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible");
    }

    @Test()
    public void test02() {
        Vehiculo toyota = new Automovil(10,100,0.9);
        Assert.assertEquals( toyota.viaje(12),"Vehiculo necesita reabastecimiento de combustible");
    }

    @Test()
    public void test03() {
        Vehiculo volvo = new Camion(10,100,1.6);
        Assert.assertEquals( volvo.viaje(4),"Vehiculo viajó 4.0 km y aún tiene 3.60 de combustible");
    }

    //Test de Stress
    @Test(invocationCount = 80,threadPoolSize = 80)
    public void testCamion01() {
        Vehiculo volvo = new Camion(10,100,1.6);
        Assert.assertEquals(volvo.recargar(40),"La cantidad de combustible del camion es: 48.0");
    }

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void testAutomovil01() {
        Vehiculo toyota = new Automovil(10,100,0.9);
        Assert.assertEquals(toyota.recargar(40),"La cantidad de combustible del automovil es: 50.0");
    }

    //Funciones
    @Test()
    public void testFunc01(){
        Vehiculo toyota = new Automovil(10,100,0.9);
        toyota.setCombustible(39);
        Assert.assertEquals( toyota.getCombustible(), 39);
    }

    @Test()
    public void testFunc02(){
        Vehiculo toyota = new Automovil(10,100,0.9);
        toyota.setConsumo(25.5);
        Assert.assertEquals( toyota.getConsumo(), 25.5);
    }

    @Test()
    public void testFunc03(){
        Vehiculo toyota = new Automovil(10,100,0.9);
        toyota.setcapacidadTanque(200);
        Assert.assertEquals( toyota.getcapacidadTanque(), 200);
    }

    @Test()
    public void testFunc04() {
        Vehiculo toyota = new Automovil(30, 100, 0.9);
        Assert.assertEquals(toyota.viaje(31), "Vehiculo viajó 31.0 km y aún tiene 2.10 de combustible");
    }

    @Test()
    public void testFunc05() {
        Vehiculo toyota = new Automovil(30, 100, 0.9);
        Assert.assertEquals(toyota.recargar(15), "La cantidad de combustible del automovil es: 45.0");
    }

    @Test()
    public void testFunc06() {
        Vehiculo volvo = new Camion(30, 100, 1.6);
        Assert.assertEquals(volvo.viaje(200), "Vehiculo necesita reabastecimiento de combustible");
    }


}