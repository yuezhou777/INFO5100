import java.util.*;
public class Checkout {
    protected int itemNum;
    protected int sum;
    protected final double taxRate = DessertShop.TAX_RATE;
    List<DessertItem> list = new ArrayList<DessertItem>();

    public Checkout(){
    }

    public void enterItem(DessertItem item) {
        list.add(item);
        itemNum++;
        sum += item.getCost();
    }

    public int numberOfItems() {
        return itemNum;
    }

    public int totalCost() {
        return sum;
    }

    public int totalTax() {
        return (int)Math.round(totalCost() * taxRate / 100);
    }

    public void clear() {
        list.clear();
        itemNum = 0;
        sum = 0;
    }

    public String toString(){
        String receipt = DessertShop.NAME + "\n" + "----------------------";
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("\n" + "Tax            " +this.totalTax());
        System.out.println("\n" + "Total Cost    " +this.totalCost());
        return receipt;
    }
}