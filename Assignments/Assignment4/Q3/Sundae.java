public class Sundae extends IceCream {
    private String topName;
    private int topCost;

    public Sundae(String name, int cost, String topName, int topCost) {
        super(name, cost);
        this.topName = topName;
        this.topCost = topCost;
    }

    public int getCost() {
        return super.getCost() + topCost;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public int getTopCost() {
        return topCost;
    }

    public void setTopCost(int topCost) {
        this.topCost = topCost;
    }

    public String toString() {
        return getTopName()+ "with" + "\n" +name+ "     " +String.valueOf(this.getCost());
    }
    
}