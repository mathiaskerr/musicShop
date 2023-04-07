public enum InstrumentType {
    BRASS("JAZZILICIOUS"),
    WOODWIND("WOODWINDY"),
    KEYBOARD("PIANOY"),
    PERCUSSION("DRUMMY"),
    MUSICTHING("IM AN INANIMATE OBJECT AAAAAH!");

    private final String sound;

    InstrumentType(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
