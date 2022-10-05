import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        String[] strArray=s.split("[ !,?._'@]+");
      //  System.out.println(Arrays.toString(strArray));
   // Arrays.toString(strArray);
        int len=strArray.length;
        System.out.println(len);
        for(int i =0; i < len ; i++){
            System.out.println(strArray[i]);
        }
        scan.close();
    }
}
