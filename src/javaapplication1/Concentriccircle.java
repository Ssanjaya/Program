
package javaapplication1;

import java.util.Scanner;

public class Concentriccircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of inner circle: ");
        int r1=sc.nextInt();
        System.out.println("Enter the radius of outer circle: ");
        int r2=sc.nextInt();
        double area1=Math.PI*(r1*r1);
        double area2=Math.PI*(r2*r2);
        double space=area2-area1;
        System.out.print("The between the circle is: "+space);
        
    }
    
}
