package cake;

public class BirthdayCake extends Cake {
    private int candles;
    public BirthdayCake(String flavor, double price, int candleCount){
        super(flavor, price);
        this.candles = candleCount;

    }

    public int getCandleCount(){
        return this.candles;
    }

    public int setCount(int count){
        return this.candles = count;
    }
}
