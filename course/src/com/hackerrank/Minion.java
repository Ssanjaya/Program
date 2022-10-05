import java.util.Scanner;
public class Minion{
    public static void method(int[] arr,int a,int j){

        int sum[] = new int[a];
        int flag=0;
        for(int i = 0; i < a; i++){
            if(j!=i)
                sum[i]+=arr[i];
            flag=1;
        }

        for(int k = 0; k < a; k++){
            System.out.println(sum[k]+" ");
        }
        if(flag==1)
            method(arr,10,j+1);
    }
    public static void main(String[] args){
        int j = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] array = new int[a];
        for(int i = 0; i < a;i++){
            array[i] = s.nextInt();
        }
        method(array,a,j);

    }
}