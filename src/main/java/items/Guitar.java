package items;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(double purchasedprice, double saleprice, InstrumentType instrumentType, int strings) {
        super(purchasedprice, saleprice, instrumentType);
        this.strings = strings;
    }
}
