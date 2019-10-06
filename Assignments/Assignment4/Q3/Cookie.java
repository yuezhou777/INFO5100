public class Cookie extends DessertItem {
    protected int number;
    private double pricePerDozen;

    public Cookie(String name, int number, double pricePerDozen){
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    public int getCost(){
        return  (int)Math.round(number * pricePerDozen / 12);
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    public String toString(){
        return number+ " @ " +pricePerDozen+ "/dz." + "\n" +name+ "   " +this.getCost();
    }
    
}