
package javaapplication1;

import java.util.Scanner;

public class Rightrotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many times the array need to be rotated: ");
        int n=sc.nextInt();
        int []arr=new int[10];
        System.out.println("Enter the elements  of the array: ");
        for(int i=0;i<10-1;i++){
            arr[i]=sc.nextInt();    
        }
          System.out.println("Array before rotation: ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");     
        }
    for(int i=0;i<n;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("\n"+"Array after right rotation: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
        
}
    

