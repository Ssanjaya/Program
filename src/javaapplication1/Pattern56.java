
package javaapplication1;

public class Pattern56
{
    public static void main(String []args){
        int a=1,i,j,n=10;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(a++ +" ");
                if(a == n+1){
                    System.exit(0);
                }
            }
            System.out.println();
        }
    }
}
