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

        Assert.assertEquals("Ataque combinados", 35, v.PersonasEnAtaqueCombinado());
    }

}
