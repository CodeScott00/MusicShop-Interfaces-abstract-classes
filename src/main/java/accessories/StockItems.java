package accessories;

import behaviours.ISell;

import java.util.stream.IntStream;

public abstract class StockItems implements ISell {

    private double priceBought;
    private double priceSold;

    public StockItems(double priceBought, double priceSold){
        this.priceBought = priceBought;
        this.priceSold = priceSold;

    }

    public double getPriceBought(){
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }
}

//attributes passed down and working, calaculatemarkup() not done yet, also do we need buyprice(0 and sellprice()??

