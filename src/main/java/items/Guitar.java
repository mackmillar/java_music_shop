package items;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(String sound, double purchasedprice, InstrumentType instrumentType, int strings) {
        super(sound, purchasedprice, instrumentType);
        this.strings = strings;
    }
}
