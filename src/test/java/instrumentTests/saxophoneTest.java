package instrumentTests;

import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class saxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(55,130,"brass","gold",25);
    }

    @Test
    public void hasNumOfValves(){
        assertEquals(25, saxophone.getNumOfValves());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("bing bing BINNNG bing", saxophone.play());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(75, saxophone.calculateMarkUp(),0.1);
    }
}
