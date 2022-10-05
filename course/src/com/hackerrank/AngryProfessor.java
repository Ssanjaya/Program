import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        int min=0;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=0)
                min++;
        }
        if(min>(arr.length/2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
