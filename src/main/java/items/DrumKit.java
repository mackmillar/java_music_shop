package items;

public class DrumKit extends Instrument {

    private String brand;

    public DrumKit(double purchasedprice, double saleprice, InstrumentType instrumentType, String brand) {
        super(purchasedprice, saleprice, instrumentType);
        this.brand = brand;
    }


}
