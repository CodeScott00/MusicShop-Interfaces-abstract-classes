package accessories;

import behaviours.ISell;
//need to implement ISell and extend stock once created
public class Drumstick extends StockItems{

    private String make;
    private String description;


    public Drumstick(double priceBought, double priceSold, String make, String description) {
        super(priceBought, priceSold);
        this.make = make;
        this.description = description;

    }

    public String getMake() {
        return make;
    }




}


