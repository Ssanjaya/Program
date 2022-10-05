
package javaapplication1;

import java.util.Scanner;

public class Rotation {
    public static void leftrotation(int arr[],int n){
    for(int i=0;i<n;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println("\n"+"Array after left rotation: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
}
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many times the array need to be rotated: ");
        int n=sc.nextInt();
        int []arr=new int[10];
        System.out.println("Enter the elements  of the array: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();    
        }
          System.out.println("Array before rotation: ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");     
        }
        Rotation.leftrotation(arr, n);      
}
}
