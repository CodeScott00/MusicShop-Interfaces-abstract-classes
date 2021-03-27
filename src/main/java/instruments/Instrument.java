package instruments;

import behaviours.IPlay;

//will implemnt iplay next and then be passed down and tested at sublclasses
public abstract class Instrument implements IPlay {

    private String madeOfMaterial;
    private String colour;

    public Instrument(String madeOfMaterial, String colour){
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
