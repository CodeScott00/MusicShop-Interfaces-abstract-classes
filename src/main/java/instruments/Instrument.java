package instruments;

//will extends stockitem and implemnt iplay
public abstract class Instrument {

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
