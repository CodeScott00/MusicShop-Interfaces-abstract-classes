package instrumentTests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class pianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "brown" ,88);
    }

    @Test
    public void hasNumOfKeys(){
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void hasMadeOfMaterial(){
        assertEquals("wood", piano.getMadeOfMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("bing bing BINNNG bing", piano.play());
    }
}
