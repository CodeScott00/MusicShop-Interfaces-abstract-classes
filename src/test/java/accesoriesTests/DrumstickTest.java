package accesoriesTests;

import accessories.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void before(){
        drumstick = new Drumstick("Rocket", "Sexy Drumstick", 10, 30);
    }

    @Test
    public void hasMake(){
        assertEquals("Rocket", drumstick.getMake());
    }
}
