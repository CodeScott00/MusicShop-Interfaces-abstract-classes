package instrumentTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(75.10, 109.50,"fire", "red",6);
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfString());
    }

    @Test
    public void hasMadeOfMaterial(){
        assertEquals("fire", guitar.getMadeOfMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("ding a ding adingaling", guitar.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(34.4, guitar.calculateMarkUp(), 0.1);
    }

}
