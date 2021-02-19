package items;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(String sound, double purchasedprice, InstrumentType instrumentType, int valves) {
        super(sound, purchasedprice,  instrumentType);
        this.valves = valves;
    }
}
