/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author purus
 */
public class Copy {
        public static void copyArray(int[]arr,int len){
        int []arr1=new int[len];
        System.out.print("Elements of Array1: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<len;i++){
            arr1[i]=arr[i];
        }
        System.out.print("\n"+"Elements of Array2: ");
        for(int i=0;i<len;i++){
            System.out.print(arr1[i]);
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
    Copy a=new Copy();
    a.copyArray(arr,len);
}
}
