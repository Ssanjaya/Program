
package javaapplication1;

import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural number is: "+sum);
        int big=0;
        while(sum!=0){
            int rem=sum%10;
            if(big<rem)
                big=rem;
            sum/=10;
            
        }
        System.out.println("Largest digit of sum is: "+big);
    }
    
}
