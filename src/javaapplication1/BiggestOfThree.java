
package javaapplication1;

import java.util.Scanner;

public class BiggestOfThree {
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
         int big=(a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println("Biggest of three number is:"+big);
    
}

}
