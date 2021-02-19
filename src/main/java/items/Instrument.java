package items;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay {

    private String sound;
    private double purchasedprice;
    private double saleprice;
    private InstrumentType instrumentType;

    public Instrument(String sound, double purchasedprice, InstrumentType instrumentType) {
        this.sound = sound;
        this.purchasedprice = purchasedprice;
        this.saleprice = purchasedprice * 0.5;
        this.instrumentType = instrumentType;
    }

    public String play() {
        return sound;
    }

    public double getPurchasedPrice() {
        return purchasedprice;
    }

    public double getSalePrice() {
        return saleprice;
    }


}
