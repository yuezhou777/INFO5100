public class DessertShop {
    public static final String NAME = "YZ Dessert Shop";
    public static final double TAX_RATE = 7.0;
    public static final int MAX_ITEMNAME_SIZE = 30;
    public static final int ITEM_COST_WIDTH = 8;

    public static String cents2dollarsAndCents(int cents){
        String trans = "";
        int dollar = cents / 100;
        int cent = cents % 100;
        if(dollar >= 0){
            trans += dollar;
        }
        trans += ".";
        if(cent < 10){
            trans += "0";
        }
        trans += cent;
        return trans;
    }
}