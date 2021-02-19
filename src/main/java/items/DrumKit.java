package items;

public class DrumKit extends Instrument {

    private String brand;

    public DrumKit(String sound, double purchasedprice, InstrumentType instrumentType, String brand) {
        super(sound, purchasedprice, instrumentType);
        this.brand = brand;
    }


}
