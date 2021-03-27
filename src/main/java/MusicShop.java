import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;


    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStockList() {
        return this.stock.size();
    }

    public void addToStockList(ISell item){     //explain why isell is going in here?
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

//    public double calculateMarkUp(){              //should i implement isell for markup?
//        double total = 0;
//        for (ISell item in stock){
//            total += calculateMarkUp();
//        }
//        return total;
//
//    }
}
