
package javaapplication1;

import java.util.Scanner;

public class Pattern60 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int outnum=0,sum=0;
        for(int i=0;i<n;i++){
            outnum=outnum*10+1;
            System.out.print(outnum+" ");
            sum=sum+outnum;
        }
        System.out.println("\n"+sum);
}
}

