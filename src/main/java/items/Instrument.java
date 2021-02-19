package items;

public abstract class Instrument {

    private double purchasedprice;
    private double saleprice;
    private InstrumentType instrumentType;

    public Instrument(double purchasedprice, double saleprice, InstrumentType instrumentType) {
        this.purchasedprice = purchasedprice;
        this.saleprice = saleprice;
        this.instrumentType = instrumentType;
    }


}
