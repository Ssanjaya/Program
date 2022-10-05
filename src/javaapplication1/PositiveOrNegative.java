
package javaapplication1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number: " );
    int num=sc.nextInt();
    if(num>0)
        System.out.print("The number is positive");
    else{
        System.out.print("The number is negative");
    }
}
}
