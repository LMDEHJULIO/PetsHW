package cake;

public class WeddingCake extends Cake {
    int tiers;

    public WeddingCake(String flavor, double price, int tiers){
        super(flavor, price);
        this.tiers = tiers;
    }

    public int getTiers(){
        return this.tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
}
