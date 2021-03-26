package instrumentTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6);
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfString());
    }
}
