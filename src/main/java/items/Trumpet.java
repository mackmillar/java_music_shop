package items;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(double purchasedprice, double saleprice, InstrumentType instrumentType, int valves) {
        super(purchasedprice, saleprice, instrumentType);
        this.valves = valves;
    }
}
