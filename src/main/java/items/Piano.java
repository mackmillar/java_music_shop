package items;

public class Piano extends Instrument {

    private String size;

    public Piano(double purchasedprice, double saleprice, InstrumentType instrumentType, String size) {
        super(purchasedprice, saleprice, instrumentType);
        this.size = size;
    }
}
