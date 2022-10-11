import java.util.InputMismatchException;
import java.util.Scanner;

public class Method {
    public void method(){Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        PrintService.display();
        int choice = 0;
        WHILE:
        while (true) {
            PrintService.printMenu();
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice > 0 || choice <= 3){
                    switch (choice) {
                        case 1:
                            bank.registerAccount();
                            break;
                        case 2:
                            bank.loginAccount();
                            break;
                        case 3:
                            break WHILE;
                    }}
            } catch (InputMismatchException e) {
                System.out.println("Enter option again : ");
            }
        }}

}
