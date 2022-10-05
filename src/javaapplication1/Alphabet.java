
package javaapplication1;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        char ch=sc.next().charAt(0);
        if(Character.isAlphabetic(ch))
            System.out.println("It is an alphabet");
        else
            System.out.println("It is not an alphabet");
            
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("It is an alphabet");
        else
           System.out.println("It is not an alphabet");      
    }
}
