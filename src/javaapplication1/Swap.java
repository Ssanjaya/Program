
package javaapplication1;

import java.util.Scanner;

public class Swap {
        static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print("After swapping A="+a+"   "+"B="+b);
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers A:");
        int a=sc.nextInt();
        System.out.println("Enter the numbers B:");
        int b=sc.nextInt();
        swap(a,b);
      
    }

}
