
package javaapplication1;

import java.util.Scanner;

public class ReverseString {
    public String reverse(String[] str, int i){
        if(i<0)
            return " ";
        return str[i]+" "+reverse(str,i-1);
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the string: ");
       String str=sc.nextLine();
       ReverseString obj=new ReverseString();
       String str2=obj.reverse(str.split(" "),str.split(" ").length-1);
       System.out.print(str2);
    }
}
