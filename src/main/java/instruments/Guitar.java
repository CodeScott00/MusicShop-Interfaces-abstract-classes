package instruments;

public class Guitar extends Instrument {

    private int numOfString;

    public Guitar(String madeOfMaterial, String Colour, int numOfStrings){
        super(madeOfMaterial, Colour);
        this.numOfString = numOfStrings;
    }

    public int getNumOfString() {
        return numOfString;
    }

    public String play(){
        return "ding a ding adingaling";
    }


}
