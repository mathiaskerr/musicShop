import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicThingsTest {
    MusicThings musicThings;
    @Before
    public void before(){
        musicThings = new MusicThings(InstrumentType.MUSICTHING ,"drum sticks",5,10);
    }
    @Test
    public void hasNamePriceETC(){
        assertEquals("drum sticks",musicThings.getName());
        assertEquals(5,musicThings.getBuyPrice(),0);
        assertEquals(10,musicThings.getSellPrice(),0);
    }
    @Test
    public void canCalculateMarkU(){
        assertEquals(100,musicThings.calculateMarkup(),0);
    }
}
