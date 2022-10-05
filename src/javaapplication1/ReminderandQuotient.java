
package javaapplication1;

import java.util.Scanner;

public class ReminderandQuotient {
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Divisor:");
        int divident=sc.nextInt();
        System.out.print("Enter the Divident:");
        int divisor=sc.nextInt();
        System.out.print("Quotient :"+ divident/divisor +"   "+"Remainder :"+divident%divisor);
   
}

}
