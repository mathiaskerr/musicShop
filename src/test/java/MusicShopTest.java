import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    Saxophone saxophone;
    Drums drums;
    MusicThings musicThings;

    MusicShop musicShop;
    @Before
    public void before(){
        musicThings = new MusicThings(InstrumentType.MUSICTHING,"drum sticks",5,10);
        saxophone = new Saxophone(InstrumentType.WOODWIND,50,75);
        drums = new Drums(InstrumentType.PERCUSSION,100,125);
        musicShop = new MusicShop(1000.0);
    }
    @Test
    public void canAddStock(){
        musicShop.addStock(saxophone);
        assertEquals(1,musicShop.getMusicThings().size());
    }

    @Test
    public void canSellthing(){
        musicShop.addStock(saxophone);
        musicShop.sellItem(saxophone);
        assertEquals(0,musicShop.getMusicThings().size());

    }
}
