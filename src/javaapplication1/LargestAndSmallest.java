
package javaapplication1;

import java.util.Scanner;

public class LargestAndSmallest {
        public static void largestAndSmallest(int[]arr,int len){
        int temp;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println("Largest of array:"+arr[len-1]+"\n"+"Smallest of an array:"+arr[0]);
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
    LargestAndSmallest a=new LargestAndSmallest();
    a.largestAndSmallest(arr,len);

}
    
}
