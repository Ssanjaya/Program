
package javaapplication1;

import java.util.Scanner;

public class Differncebetweennumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
    int num=sc.nextInt();
    int rem,rev=0;int num1=num;
    while(num1!=0){
       rem=num1%10;
       rev=rev*10+rem;
       num1=num1/10;
    }
    int a=num-rev;
    System.out.println(num +"-" +rev+" = "+a);

}

}
