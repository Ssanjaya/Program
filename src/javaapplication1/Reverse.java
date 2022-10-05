
package javaapplication1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int rev=0,rem=0;
        while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
    }
        System.out.print("Reverse of the given number is: "+rev);
    
}
}