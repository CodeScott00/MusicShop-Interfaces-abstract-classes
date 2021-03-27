package instruments;

public class Piano extends Instrument{

    private int numOfKeys;

    public Piano(String madeOfMaterial, String colour, int numOfKeys) {
        super(madeOfMaterial, colour);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys(){
       return numOfKeys;
    }

    public String play(){
        return "bing bing BINNNG bing";
    }
}
