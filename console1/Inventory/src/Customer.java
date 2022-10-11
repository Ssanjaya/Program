import java.util.ArrayList;

public class Customer {
    private int customer_Id;
    private String customer_Name;
    private int quantity;
    private int item_No;
    private float total_Bill;
    public void addCustomerDetails(Customer c){
        this.customer_Name=c.customer_Name;
        this.quantity=c.quantity;
     }
    public void DisplayCustomerBill(ArrayList<Customer> cus , String cus_name , ArrayList<Shop> shoplist) {
        float total = 0;
        System.out.println("===========Billing Details=============");

        for (Customer c: cus) {
            if (c.customer_Name.equals(cus_name)) {
                System.out.println("Item Number : " + c.item_No);
                System.out.println("Item NAme : " + c.customer_Name);
                System.out.println("Item price : " + c.quantity);
                System.out.println("Total Bill : " + c.total_Bill);
                for (Shop shop : shoplist) {
                    if (shop.getItem_No() == c.item_No) {
                        total += c.quantity * shop.getItem_Price();
                    }
                }

            }
        }
        System.out.println("===================================");
        System.out.println("Total Bill Before Discount == " + total);
        float discount = 0 ;
        if(total < 200){
            discount = total*15 /100;
        }
        else if(total >= 200 && total < 700){
            discount=(total*25)/100;
        } else if (total > 700) {
            discount = (total*50)/100;

            }

        System.out.println("Total Bill After Discount == "+ (total-discount));
    }
    public void updateItem(){

    }
    public float getTotal_Bill() {
        return customer_Id;
    }

    public void setTotal_Bill0(float total_Bill) {
        this.total_Bill = total_Bill;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItem_No() {
        return item_No;
    }

    public void setItem_No(int item_No) {
        this.item_No = item_No;
    }


}
