
package javaapplication1;

import java.util.Scanner;
public class AreaCylinder {
        public static void main(String args[]) {

            Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
       	int r=sc.nextInt();
       	System.out.print("Enter the height: ");
       	int h=sc.nextInt();
       	double area=(2*Math.PI*r*h)+(2*Math.PI*r*r);
       	System.out.printf("Area of cylinder= "+area);
       	
      
    }

}
