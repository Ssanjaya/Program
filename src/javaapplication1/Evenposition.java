
package javaapplication1;

import java.util.Scanner;

public class Evenposition {
        public static void even(int []arr,int len){
        
        System.out.println("Elements in Even position:");
        for(int i=1;i<len;i+=2){
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
    Evenposition a=new Evenposition();
    a.even(arr,len);

    
}

    void odd(int[] arr, int len) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
