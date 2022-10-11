import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
class Bank {
      List<Account> bankAccounts= new ArrayList<>();
      Scanner sc= new Scanner(System.in);


     public Account AccountExistance( String phoneNumber ,String password) {
         for (Account account : bankAccounts) {
             if ( account.getPhoneNumber().equals(phoneNumber) && account.getPassword().equals(password)) {
                 return account;
             }
             else System.out.println("Provide the valid details");
         }
         return null;
     }
     public void registerAccount() {
         System.out.println("Enter your First name :");
         String firstName = sc.next();
         System.out.println("Enter your Last name:");
         String lastName = sc.next();
         System.out.println("Enter your Phone number:");
         String phoneNumber=null;
         WHILE:
         while(true){
             try {
             phoneNumber = new Scanner(System.in).next();
             if(isPhoneNumberCorrect(phoneNumber)){
                 break WHILE;
             }
         }catch(InputMismatchException e){
                 System.out.println(" Please Enter the vaild Mobile Number");
             }
         }
         System.out.println("Enter your Password");
         String password =sc.next();
              if((isPhoneNumberCorrect(phoneNumber))&&(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z A-Z])(?=.*[@#$%^&+=]).*$"))){
               bankAccounts.add(new Account(firstName, lastName, phoneNumber,password));
               System.out.println("You have created account successfully!" + "\n" +
                 "Your account ID is: " + bankAccounts.get(bankAccounts.size() - 1).getID());
              }
              else System.out.println("Enter the password with a Uppercase and a digit and a Special character");
     }

     public void loginAccount() {
         System.out.println("Please enter your phone number:");
         String phoneNumber = sc.next();
         System.out.println("Please the password :");
         String password= sc.next();
         String storedPhoneNumber = bankAccounts.get(bankAccounts.size() - 1).getPhoneNumber();
         String storedPassword = bankAccounts.get(bankAccounts.size()-1).getPassword();
         if ((storedPhoneNumber.equals(phoneNumber) ) && ( storedPassword.equals(password)))
         {
             Account selectedAccount = AccountExistance(phoneNumber,password);
             boolean exitRequested = false;
             while (!exitRequested) {
                 PrintService.existAccountMenu();
                 int choice = Integer.parseInt(sc.next());
                 switch (choice) {
                     case 1:
                         System.out.println(selectedAccount.toString());
                         break;
                     case 2:
                         System.out.println("Please enter the amount to be deposited:");
                         double depositAmount = sc.nextDouble();
                         selectedAccount.depositMoney(depositAmount);
                         break;
                     case 3:
                         System.out.println("Please enter the amount to be widthdrawan:");
                         double withdrawalAmount = sc.nextDouble();
                         selectedAccount.withdrawal(withdrawalAmount);
                         break;
                     case 4:
                         System.out.println("Please enter the phone number of the account you want to transfer to: ");
                         String accountPhoneNumber = sc.next();
                         if (isPhoneNumberCorrect(accountPhoneNumber)) {
                             Account accountToTransfer = AccountExistance(accountPhoneNumber,password);
                             System.out.println("Enter the amount of money you would like to transfer:");
                             double moneyToTransfer = sc.nextDouble();
                             selectedAccount.moneyTransfer(selectedAccount, accountToTransfer, moneyToTransfer);
                             break;
                         }
                     case 5:
                         exitRequested = true;
                         break;
                     default:
                         System.out.println("Wrong input");
                         break;
                 }
             }
         }
     }

     public static Boolean isPhoneNumberCorrect(String phoneNumber){
         if(phoneNumber.length() != 10){
             System.out.println("Phone number must be 10 digits.");
             return false;

         } else {
             return true;
         }
     }

}
