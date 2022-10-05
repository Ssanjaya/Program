import java.util.Scanner;

public class Recursion {
    public static void recursiveMethod(String str) {
        int n = str.length();
        if (n > 0) {
            System.out.print(str.charAt(n - 1));
            recursiveMethod(str.substring(0, n - 1));
        }
    }
    public static int[] recursiveMethod1(int []arr, int startIndex, int endIndex){
            if(startIndex < endIndex){
                int temp=arr[startIndex];
                arr[startIndex]=arr[endIndex];
                arr[endIndex]=temp;
                recursiveMethod1(arr,startIndex+1,endIndex-1);
            }
            return arr;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        recursiveMethod(str);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int[] reverseArray= recursiveMethod1(arr,0,arr.length-1);
        for(int i=0;i<n;i++)
            System.out.print(reverseArray[i]+" ");
    }
}
