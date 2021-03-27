import accessories.Sheetmusic;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar;
    Sheetmusic sheetmusic;

    @Before
    public void before() {
        musicShop = new MusicShop("Rays music shop");
        guitar = new Guitar(20, 30, "wood", "blue", 6);
        sheetmusic = new Sheetmusic(20,30,"galileo", "all the beats");
    }

    @Test
    public void hasName(){
        assertEquals("Rays music shop", musicShop.getName());
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, musicShop.getStockList());
    }

    @Test
    public void stockListCanAdd(){
        musicShop.addToStockList(guitar);
        assertEquals(1, musicShop.getStockList());
    }

    @Test
    public void stockListCanAdd2(){
        musicShop.addToStockList(guitar);
        musicShop.addToStockList(sheetmusic);
        assertEquals(2,musicShop.getStockList());
    }
                                                        // get this explained
    @Test
    public void canRemoveItemFromStock(){
        musicShop.addToStockList(guitar);
        musicShop.addToStockList(sheetmusic);
        musicShop.removeItemFromStock(guitar);
        assertEquals(1,musicShop.getStockList());

    }
}
