
package javaapplication1;

public class Pattern50 {
    public static void main(String []args){
        int n=9;
        for(int i=n;i>0;i--){
            for(int j=i;j<n;j++){
               System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
