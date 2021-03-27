package accesoriesTests;

import accessories.Sheetmusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetmusicTest {

    Sheetmusic sheetmusic;

    @Before
    public void before() {
        sheetmusic = new Sheetmusic(10,21.99,"Galileo", "Musical ears");
    }

    @Test
    public void hasAuthor(){
        assertEquals("Galileo", sheetmusic.getAuthor());
    }

    @Test
    public void hasPriceSold(){
        assertEquals(21.99, sheetmusic.getPriceSold(), 0);
    }

    @Test
    public void canHaveMarkup(){
        assertEquals(11.99,sheetmusic.calculateMarkUp(), 0.1);
    }

}
