
package javaapplication1;

import java.util.Scanner;

public class AreaRectangle {
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
       	int l=sc.nextInt();
       	System.out.print("Enter the breadth: ");
       	int b=sc.nextInt();
       	double area=l*b;
       	System.out.printf("Area of rectangle= "+area);
       	
      
    }

}
