package accesoriesTests;

import accessories.Sheetmusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetmusicTest {

    Sheetmusic sheetmusic;

    @Before
    public void before() {
        sheetmusic = new Sheetmusic("Galileo", "Musical ears");
    }

    @Test
    public void hasAuthor(){
        assertEquals("Galileo", sheetmusic.getAuthor());
    }
}
