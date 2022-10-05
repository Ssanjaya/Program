import java.util.HashSet;
import java.util.Scanner;

public class contest {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        HashSet<Integer> set = new HashSet<Integer>();
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for(int i = 0 ; i <n ; i++){
            int len = sc.nextInt();
            int []arr =new int[len];
            for(int j =0 ; j <len ; j++){
                arr[i]=sc.nextInt();
            }
            for( int j : arr){
                set.add(arr[j]);
            }
            System.out.println((set.size())-1);
        }
    }
}
