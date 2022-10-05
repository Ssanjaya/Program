import java.util.Scanner;

public class Recepit {

    public static void recepitOfRestaurant() {
        // your code goes here
        int[] menu = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int count=0,ind=menu.length-1;
            int val = sc.nextInt();
            while(ind>=0){
                if(val>=menu[ind]){
                    val-=menu[ind];
                    count++;
                }
                ind--;

            }
            System.out.println(count);
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t>0)
//        {
//            int n=sc.nextInt();
//            int count=0;
//            for(int i=11;i>=0;i--)
//            {
//                while(n>=Math.pow(2,i))
//                {
//                    n-=Math.pow(2,i);
//                    count++;
//                }
//            }
//            System.out.println(count);
//            t--;
//        }
    }
}
