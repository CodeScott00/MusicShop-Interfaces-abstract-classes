package accesoriesTests;

import accessories.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void before(){
        drumstick = new Drumstick(20,40,"Rocket", "Sexy Drumstick");
    }

    @Test
    public void hasMake(){
        assertEquals("Rocket", drumstick.getMake());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(20, drumstick.getPriceBought(), 0);
    }
}
