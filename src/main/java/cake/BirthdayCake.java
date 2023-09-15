package cake;

public class BirthdayCake extends Cake {
    private int candles;
    public BirthdayCake(int candleCount){

        this.candles = candleCount;

    }

    public int setCount(int count){
        return this.candles = count;
    }
}
