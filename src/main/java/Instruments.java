public abstract class Instruments implements IPlay , ISell{
     private InstrumentType instrumentType;
     private Integer buyPrice;

     private Integer sellPrice;

     public Instruments(InstrumentType instrumentType, Integer buyPrice, Integer sellPrice){
          this.instrumentType = instrumentType;
          this.buyPrice = buyPrice;
          this.sellPrice = sellPrice;

     }

     public InstrumentType getInstrumentType() {
          return instrumentType;
     }

     public void setInstrumentType(InstrumentType instrumentType) {
          this.instrumentType = instrumentType;
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
}
