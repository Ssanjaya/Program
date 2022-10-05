
package javaapplication1;

public class Pattern47 {
        public static void main(String args[]) {
       	 int i,j,n=9;
	      for(i=1;i<=n;i++){
	          for(j=1;j<=(n-i)*2;j++){
	              System.out.print(" ");
	          }
	          for(j=1;j<i;j++){
	              System.out.print(j +" ");
	          }
	          for(j=i;j>=1;j--){
	              System.out.print(j +" ");
	          }
	          
	          System.out.println();
	      }

	
    }

}
