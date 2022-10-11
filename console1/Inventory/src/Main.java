import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private static ArrayList<Shop> shopList = new ArrayList<>();
    private static ArrayList<Customer> customerList = new ArrayList<>();

    public static void menu(){
        System.out.println("1.Add new item to inventory : ");
        System.out.println("2.Display item in inventory : ");
        System.out.println("3.Add customer Details : ");
        System.out.println("4.Exit ");
    }
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Shop s = new Shop();

       int option;
        do {

            menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the item number : ");
                    s.setItem_No(sc.nextInt());
                    System.out.println("Enter the name of the item need be added : ");
                    s.setItem_Name(sc.next());
                    System.out.println("Enter the price of the item : ");
                    s.setItem_Price(sc.nextInt());
                    shopList.add(s);
                    break;
                case 2:
                   Shop.displayItems(shopList);
                    break;
                case 3:
                    sellOutDetails();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(option != 4);
    }

    private static void sellOutDetails() {
        sc = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Enter customer Name:  ");
        c.setCustomer_Name(sc.next());
        System.out.println("Enter Item Number:  ");
        c.setItem_No(sc.nextInt());
        System.out.println("Enter Purchase Quantity:  ");
        c.setQuantity(sc.nextInt());

        System.out.println("Do you have more Iteams?> [yes/no]");
        String choise =sc.next();
        if(choise.equalsIgnoreCase("yes")){
            sellOutDetails();
        }
        else{
            c.DisplayCustomerBill(customerList,c.getCustomer_Name(),shopList);
        }
        c.addCustomerDetails(c);
        customerList.add(c);



    }
}
