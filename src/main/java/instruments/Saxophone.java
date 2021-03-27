package instruments;

public class Saxophone extends Instrument{

    private int numOfValves;

    public Saxophone(String madeOfMaterial, String colour, int numOfValves){
        super(madeOfMaterial, colour);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String play(){
        return "bing bing BINNNG bing";
    }
}
