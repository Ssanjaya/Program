/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int count=0;
        for(int i = 0; i< testcase ;i++){
            int num=sc.nextInt();
            while(num != 0){
                int rem = num %10;
                if(rem == 4)
                    count++;
                num = num/10;
            }
            System.out.println(count);
        }


    }
}
