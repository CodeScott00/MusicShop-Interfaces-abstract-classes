package instruments;

public class Saxophone extends Instrument{

    private int numOfValves;

    public Saxophone(double priceBought, double priceSold, String madeOfMaterial, String colour, int numOfValves){
        super(priceBought, priceSold, madeOfMaterial, colour);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String play(){
        return "bing bing BINNNG bing";
    }

    public double calculateMarkUp(){
        return getPriceSold() - getPriceBought();
    }
}
