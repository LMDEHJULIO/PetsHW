package cake;

public class TasteTester {
    public static void main(String[] args){


       BirthdayCake bDayCake1 = new BirthdayCake("Yellow", 29.99, 5);
        BirthdayCake bDayCake2 = new BirthdayCake("Marble", 35.99, 10);
        BirthdayCake bDayCake3 = new BirthdayCake("Chocolate", 40.00, 15);

        WeddingCake wedCake1, wedCake2, wedCake3;

        wedCake1 = new WeddingCake("Tahitian Vanilla", 250, 5);
        wedCake2 = new WeddingCake("Decadent Chocolate", 400, 8);
        wedCake3 = new WeddingCake("Italian Citrus", 550, 12 );

        Cake[] cakes = {bDayCake1, bDayCake2,bDayCake3, wedCake1, wedCake2, wedCake3};


        System.out.println("So many cakes, so little time. *Grabs fork* Let's see:");

        for(Cake cake : cakes){
            System.out.println("Yum, its a " + cake.getFlavor() + " cake.");
            if(cake instanceof BirthdayCake){
                System.out.println("Look at all these candles. I'd say there are " + ((BirthdayCake) cake).getCandleCount());
            } else {
                System.out.println("Look at these tiers? So high! I'd say there are " + ((WeddingCake) cake).getTiers());
            }
        }
    }
}
