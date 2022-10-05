import java.util.Scanner;

public class CircularRotation {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i = 0;i < n;i ++){
               arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number of rotation : ");
            int numberOfRotation=sc.nextInt();
            int first=0,last=arr.length-1;
            for(int i=0;i<numberOfRotation;i++){
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
            }
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]);
            }
        }
    }

