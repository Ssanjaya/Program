
package javaapplication1;

public class Expression {
    public static void main(String[]args){
        int a=20,b=10,e=20;
        e*=b+5;
        int d=10%20;
        int c=++a - b--;
        int x=69;
        int y=x>>>2;
        System.out.println(Integer.toBinaryString(y)+"  "+y);
        System.out.println(c+"  "+d+" "+e);
    }
    
}
