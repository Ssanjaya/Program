
package javaapplication1;

import java.util.Scanner;

public class SumofArray {
    public static void sumOfArray(int[]arr,int len){
        int sum=0;
        for(int i=0;i<len;i++)
           sum+=arr[i];
        System.out.println("Sum of array is:"+sum);  
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
    
}
}