
package javaapplication1;

import java.util.Scanner;

public class OddorEven {
    static void oddoreven(int num){
        if(num==0||num%2==0)
        System.out.print("Given number is Even");
        else
        System.out.print("Given number is odd");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        oddoreven(a);       
      
    }

}
