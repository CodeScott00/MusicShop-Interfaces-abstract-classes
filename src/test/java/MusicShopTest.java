import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;

    @Before
    public void before() {
        musicShop = new MusicShop("Rays music shop");
    }

    @Test
    public void hasName(){
        assertEquals("Rays music shop", musicShop.getName());
    }
}
