
package javaapplication1;

import java.util.Scanner;

public class Count {
    public static void count(int[]arr){
        int count=0;
        for(int num:arr)
            count++;
        System.out.println("Length of the array is"+count);
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
    Count a=new Count();
    a.count(arr);
}
}
