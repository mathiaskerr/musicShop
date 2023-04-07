import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {
    Saxophone saxophone;
    Drums drums;

    @Before
    public void before(){
        saxophone = new Saxophone(InstrumentType.WOODWIND,50,75);
        drums = new Drums(InstrumentType.PERCUSSION,100,125);
    }
    @Test
    public void hasNamePriceETC(){
        assertEquals(InstrumentType.WOODWIND,saxophone.getInstrumentType());
        assertEquals(50,saxophone.getBuyPrice(),0);
        assertEquals(75,saxophone.getSellPrice(),0);
    }

    @Test
    public void saxCanPlay(){
        assertEquals("I am a saxophone and I go WOODWINDY",saxophone.play());
    }
    @Test
    public void drumsCanPlay(){
        assertEquals("I am some drums and I go DRUMMY",drums.play());
    }
    @Test
    public void drumHasNamePriceETC(){
        assertEquals(InstrumentType.PERCUSSION,drums.getInstrumentType());
        assertEquals(100,drums.getBuyPrice(),0);
        assertEquals(125,drums.getSellPrice(),0);
    }
    @Test
    public void drumsCanCalculateMarkUp(){
        assertEquals(25,drums.calculateMarkup(),0);
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(50,saxophone.calculateMarkup(),0);
    }


}
