public class Customer {
    private int customer_Id;
    private String customer_Name;
    private int quantity;
    private int item_No;
    public void addCustomerDetails(Customer c){
        this.customer_Name=c.customer_Name;
        this.quantity=c.quantity;
        this.item_No=c.item_No;
    }
    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
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
