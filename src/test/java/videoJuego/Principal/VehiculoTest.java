package videoJuego.Principal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import videoJuego.Vehiculos;

public class VehiculoTest {
    private Vehiculos v;
    @Before
    public void setup(){

        v = new Vehiculos(23,12,"lanza Canñon",20);
    }
    @Test
    public void PersonasEnAtaqueCombinadoTest(){

        Assert.assertEquals("Ataque combinados", 36, v.PersonasEnAtaqueCombinado());
    }
    @Test
    public void capacidadTransporteTest(){

        Assert.assertEquals("capacidad de aguante en toneladas", 158, v.capacidadTransporte());

    }

}
