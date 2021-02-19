package items;

public class Piano extends Instrument {

    private String size;

    public Piano(String sound, double purchasedprice, InstrumentType instrumentType, String size) {
        super(sound, purchasedprice, instrumentType);
        this.size = size;
    }
}
