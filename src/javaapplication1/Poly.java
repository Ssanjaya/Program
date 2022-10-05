
package javaapplication1;

import java.util.Scanner;

public class Poly {
    public static void equation(double a,double b,double c){
        double d= (b*b)-4.0*a*c;
        if(d==0){
            double r1=-b/(2.0*a);
            System.out.println("The root is: "+r1);
        }
        else if(d>0){
         double r1=-(b+Math.sqrt(d))/(2.0*a);
         double r2=-(b-Math.sqrt(d))/(2.0*a);
         System.out.println("The root are: "+r1+"  and  "+r2);
    }
        else{
           System.out.print("The roots are: "+-(b/2.0*a)+"+i"+((Math.sqrt(-d))/2.0*a));
           System.out.print("The roots are: "+-(b/2.0*a)+"-i"+((Math.sqrt(-d))/2.0*a));
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a=sc.nextDouble();
        System.out.println("Enter the value of c: ");
        double b=sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double c=sc.nextDouble();
        Poly.equation(a, b, c);
    }
    
}
