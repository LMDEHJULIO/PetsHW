package cake;

abstract class Cake {
    private String flavor;

    private double price;

    public String getFlavor(){
        return flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.flavor = price;
    }
}
