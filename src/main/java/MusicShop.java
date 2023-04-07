import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> musicThings;
    private double till;

    public MusicShop(double till){

        this.musicThings = new ArrayList<>();
        this.till = till;
    }


    public ArrayList<ISell> getMusicThings() {
        return musicThings;
    }

    public void setMusicThings(ArrayList<ISell> musicThings) {
        this.musicThings = musicThings;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addStock(ISell thing) {
        musicThings.add(thing);
    }

    public void sellItem(ISell thing) {


    }
}
