package instrumentTests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class pianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88);
    }

    @Test
    public void hasNumOfKeys(){
        assertEquals(88, piano.getNumOfKeys());
    }
}
