package instruments;

public class Guitar extends Instrument {

    private int numOfString;

    public Guitar(double priceBought, double priceSold, String madeOfMaterial, String Colour, int numOfStrings){
        super(priceBought, priceSold, madeOfMaterial, Colour);
        this.numOfString = numOfStrings;
    }

    public int getNumOfString() {
        return numOfString;
    }

    public String play(){
        return "ding a ding adingaling";
    }




    @Override
    public double calculateMarkUp() {
        return getPriceSold() - getPriceBought();
    }


    //wheres the markup()
}
