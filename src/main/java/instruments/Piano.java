package instruments;

public class Piano extends Instrument{

    private int numOfKeys;

    public Piano(double priceBought, double priceSold, String madeOfMaterial, String colour, int numOfKeys) {
        super(priceBought, priceSold, madeOfMaterial, colour);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys(){
       return numOfKeys;
    }

    public String play(){
        return "bing bing BINNNG bing";
    }

    public double calculateMarkUp(){
        return getPriceSold() - getPriceBought();
    }
}
