
package javaapplication1;

import java.util.Scanner;
public class Frequency {
    public static void frequencyOfArray(int[]arr,int len){
        int[]frequency=new int[len];
        int visited = -1;  
        for(int i=0;i<len;i++){  
            int count = 1;  
            for(int j = i+1;j<len; j++){  
                if(arr[i] == arr[j]){  
                    count++;   
                    frequency[j] = visited;  
                }  
            }  
            if(frequency[i] != visited)  
                frequency[i] = count;  
        }   
        for(int i=0;i<frequency.length;i++){  
            if(frequency[i] != visited)  
                System.out.println("  Frequency of  " + arr[i] + "    is    " + frequency[i]);  
        }  
        
     
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.print("Enter the elements  of the array:");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
    int len=arr.length;
    Frequency a= new Frequency();
    Frequency.frequencyOfArray(arr,len);

            }
    
    
}
