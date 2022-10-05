
package javaapplication1;

public class Xpattern1 {
    public static void main(String args[]) {
        String str="12345";
     for (int i=0;i<str.length();i++)
    {
        int j = str.length() - 1 - i;
        for (int k=0;k<str.length();k++)
        {
            if (k==i||k==j){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
