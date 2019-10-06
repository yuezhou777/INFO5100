public class Candy extends DessertItem {
    protected double weight;
    private double pricePerPound;

    public Candy (String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    public int getCost() {
        return (int)Math.round(weight * pricePerPound);
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    
    public String toString(){
        return weight+ "lbs .@ " +pricePerPound+ "/lb." + "\n" +name+ "       " +this.getCost();
    }
    
}