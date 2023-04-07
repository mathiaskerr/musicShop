public class Saxophone extends Instruments{


    public Saxophone(InstrumentType instrumentType, Integer buyPrice, Integer sellPrice) {
        super(instrumentType, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        String sound = getInstrumentType().getSound();
        return"I am a saxophone and I go " + sound;
    }

    @Override
    public double calculateMarkup() {

        int x = getBuyPrice();
        int y = getSellPrice();
        return ((double)(y-x)/x)*100 ;
    }

    @Override
    public double sellItem() {
        return (double)getSellPrice();
    }
}
