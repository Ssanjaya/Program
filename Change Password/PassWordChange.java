
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PassWordChange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your current password");
          String str1=sc.next();
          System.out.println("Enter the new password");
          String str2=sc.next();
          Pattern p = Pattern.compile("[0-9 !@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
          Pattern p1= Pattern.compile("[A-Z]");
          Matcher m=p.matcher(str2);
          Matcher m1=p1.matcher(str2);
          boolean check1=m.find();
          boolean check2=m1.find();
          if(str1.equals(str2)== false)
              if((str2.length()<=10)&&(str2.length()>=6))
                  if(check1)
                      if(check2)
                          System.out.println("Password sucessfully changed");
                      else
                          System.out.println("There must me atleast single Uppercase letter");
                  else
                      System.out.println("There must me atleast single Special character and number");
              else
                  System.out.println("There must me atleast 6 - 10 character");
          else
              System.out.println("Enter the password that you have'nt used before");
                               
    }
    
}
