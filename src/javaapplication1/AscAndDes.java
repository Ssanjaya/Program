
package javaapplication1;

import java.util.Scanner;

public class AscAndDes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elementa: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elementa: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i+=2){
            int temp=0;
            int j=i+2;
            if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
            for(int i=1;i<n-1;i+=2){
            int temp=0;
            int j=i+2;
            if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
            for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            }
        
    }
    
}
