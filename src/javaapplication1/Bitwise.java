
package javaapplication1;

import java.util.Scanner;



public class Bitwise {
    public static void or(int num1,int num2){
        int result;
        result = num1 | num2;
        System.out.println(result);
    }
    public static void and(int num1,int num2){
        int result;
        result = num1&num2;
        System.out.println(result);
    }
    public static void exor(int num1,int num2){
        int  result;
        result = num1^num2;
        System.out.println(result);
    }
    public static void leftShift(int num){
      int result = num << 2;
    System.out.println(result);  
    }
    public static void rightShift(int num){
        System.out.println(num >> 2); 
                
    }
    public static void unsignedRightShift(int num){
       System.out.println(num >>> 2);               
    }
    public static void compliment(int num){
        int result = ~num;
        System.out.println(result);    
    }
    public static void main(String[]args){
        System.out.print("Enter the num1:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print("Enter the num2:");
        int n2=sc.nextInt();
        Bitwise.and(n1, n2);
        Bitwise.or(n1, n2);
        Bitwise.exor(n1, n2);
        Bitwise.compliment(n1);
        Bitwise.leftShift(n1);
        Bitwise.rightShift(n1);
        Bitwise.unsignedRightShift(n1);   
    
    }
}
