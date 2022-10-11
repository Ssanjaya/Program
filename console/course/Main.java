import com.menu.Menu;
import com.registrationAndLogIn.LogIn;
import com.registrationAndLogIn.Register;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();
        LogIn logIn = new LogIn();
        Menu menu = new Menu();

        int choice;
        String userId;

        while (true)
        {
            System.out.println("Enter your choice\n1.Register\n2.Login\n3.Exit");
            choice = scanner.nextInt();
            if (choice == 3)
                break;
            switch (choice)
            {
                case 1:
                    register.addData(scanner);
                    break;
                case 2:
                    userId = logIn.loginUser(scanner);
                    if(!(userId == null))
                        menu.menu(scanner, userId);
                    break;
                default:
                    System.out.println("Please choose correct option!");
            }
        }

    }
}