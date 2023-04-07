public class MusicThings implements ISell {
    private InstrumentType instrumentType;

    private String name;
    private Integer buyPrice;
    private Integer sellPrice;
    public MusicThings(InstrumentType instrumentType,String name,Integer buyPrice, Integer sellPrice){
        this.instrumentType=instrumentType;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }


    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        int x = getBuyPrice();
        int y = getSellPrice();
        return ((y-x)/x)*100;
    }

}
