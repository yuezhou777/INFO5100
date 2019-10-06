public abstract class DessertItem {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DessertItem() {

    }

    public DessertItem(String name) {
        if(name.length() <= DessertShop.MAX_ITEMNAME_SIZE){
            this.name = name;
        }else{
            this.name = name.substring(0, DessertShop.MAX_ITEMNAME_SIZE);
        }
    }
    
    public abstract int getCost();
}