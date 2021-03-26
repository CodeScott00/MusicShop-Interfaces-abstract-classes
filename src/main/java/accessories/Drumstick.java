package accessories;

import behaviours.ISell;
//need to implement ISell and extend stock once created
public class Drumstick {

    private String make;
    private String description;


    public Drumstick(String make, String description, double priceBought, double priceSold) {
        this.make = make;
        this.description = description;

    }

    public String getMake() {
        return make;
    }

    public String getDescription() {
        return description;
    }


}


