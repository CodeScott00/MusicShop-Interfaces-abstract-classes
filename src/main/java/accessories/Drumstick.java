package accessories;

import behaviours.ISell;
//need to implement ISell and extend stock once created
public class Drumstick {

    private String make;
    private String description;
    private double priceBought;
    private double priceSold;

    public Drumstick(String make, String description, double priceBought, double priceSold) {
        this.make = make;
        this.description = description;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getMake() {
        return make;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }
}



