import java.util.ArrayList;

public class Shop {
    private static int item_No ;
    private static String item_Name;
    private static int item_Price;
    public int getItem_No() {
        return item_No;
    }

    public void setItem_No(int item_No) {
        this.item_No = item_No;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public int getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(int item_Price) {
        this.item_Price = item_Price;
    }



    public void addNewItem(Shop s){
        this.item_Name =s.item_Name;
        this.item_No = s.item_No;
        this.item_Price = s.item_Price;
    }
    public static void displayItems(ArrayList<Shop> arrlist){
        for(Shop shop : arrlist){
            System.out.println("===========Added Items=============");
            System.out.println("Item Name : "+Shop.item_Name);
            System.out.println("Item Number : "+Shop.item_No);
            System.out.println("Item price : "+Shop.item_Price);
            System.out.println("===================================");

        }
    }


}
