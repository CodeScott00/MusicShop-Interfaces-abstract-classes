package instruments;

import accessories.StockItems;
import behaviours.IPlay;
import behaviours.ISell;

//will implemnt iplay next and then be passed down and tested at sublclasses
public abstract class Instrument extends StockItems implements IPlay {

    private String madeOfMaterial;
    private String colour;

    public Instrument(double priceBought, double priceSold, String madeOfMaterial, String colour){
        super(priceBought, priceSold);
        this.madeOfMaterial = madeOfMaterial;
        this.colour = colour;
    }

    public String getMadeOfMaterial() {
        return madeOfMaterial;
    }

    public String getColour() {
        return colour;
    }
}
