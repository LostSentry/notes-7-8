public class Tire {

    private String name;
    private double price;
    private  int warrantyMiles;

    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000M() {
        double pricePerThou = (this.price / warrantyMiles) * 1000;
        return pricePerThou;
    }

    public double costForSet(){
        return this.price * 4;
    }

    @Override
    public String toString() {
        double pricePerThou = pricePer1000M();
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f. ", this.name, this.price, pricePerThou);
       // return "This tire is called " + name;
    }
}
