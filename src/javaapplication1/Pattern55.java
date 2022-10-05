
package javaapplication1;

import java.util.Scanner;
public class Pattern55 {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter the number");
       int n=sc.nextInt();      
    for (int i=0;i<n;i++)
    {
        System.out.printf("*");
        for (int j = 0;j<(n-1);j++)
        {
            if(i==0||i==n-1)
                System.out.printf("*");
            else
                continue;
        }
        System.out.println();
    }
}
}
