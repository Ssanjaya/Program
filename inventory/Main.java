import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> shopList = new ArrayList<>();
        Shop s = new Shop();
       int option;
        do {
            Shop.menu();
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
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(option != 4);
    }
}
