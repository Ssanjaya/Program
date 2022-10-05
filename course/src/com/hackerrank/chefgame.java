import java.util.Scanner;

public class chefgame {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i = 0; i < testcase ; i++){
            int turns=sc.nextInt();
            int aPlayerTime=sc.nextInt();
            int bPlayerTime=sc.nextInt();
            int duration=(2*(180+turns))-(aPlayerTime+bPlayerTime);
            System.out.println(duration);
        }

    }
}
