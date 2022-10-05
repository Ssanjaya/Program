
package javaapplication1;

import java.util.Scanner;

public class Oddposition {
    public static void oddAndEven(int []arr,int len){
        System.out.println("Elements in odd position:");
        for(int i=0;i<len;i+=2){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int n=sc.nextInt();
    int []arr=new int [n];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int len=arr.length;
    Oddposition a=new Oddposition();
    a.oddAndEven(arr,len);

}
}
    
