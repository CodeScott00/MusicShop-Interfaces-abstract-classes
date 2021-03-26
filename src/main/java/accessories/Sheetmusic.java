package accessories;

public class Sheetmusic extends StockItems {

    private String author;
    private String description;


    public Sheetmusic(double priceBought, double priceSold, String author, String description){
        super(priceBought, priceSold);
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
