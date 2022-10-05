
package javaapplication1;

public class Pattern48 {
        public static void main(String args[]) {
    int i,j,n=9;
        for(i=n; i>=1; i-- ){
             for(j=1; j<=i*2; j++){
                 System.out.print(" ");
              }
             for(j=i; j<=n; j++){
                System.out.print(j+" ");
             }
            for(j=n-1; j>=i; j--){
                 System.out.print(j+" "); 
             }
        System.out.println();
    }
    }

}
