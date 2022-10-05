
package javaapplication1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
             fact*=i;
        }
        System.out.println("Factorial of given num is: "+fact);
        int rem,sum=0;
        while (fact!=0){
          rem=fact%10;
          sum+=rem;
          fact/=10;
    }
        System.out.print("Sum of digit: "+sum);
    }
}
