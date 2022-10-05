
package javaapplication1;

public class matrix {   
    public static void main(String args[]) {
       	int n=3;
       	int mat[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       	System.out.println("Original matrix:");
       	for(int i=0;i<n;i++){
       	    for(int j=0;j<n;j++){
       	    System.out.print(mat[i][j]+" ");
       	}
       	System.out.println();
       	}
       	for(int i=0;i<n;i++){
       	    for(int j=i;j<n;j++){
       	    int temp=mat[i][j];
       	    mat[i][j]=mat[j][i];
       	    mat[j][i]=temp;
       	}
       	}
       	for(int i=0;i<n;i++){
       	    int low=0,high=n-1;
       	    while(low<high){
       	    int temp=mat[i][low];
       	    mat[i][low]=mat[i][high];
       	    mat[i][high]=temp;
       	    high--;
       	    low++;
       	}
       	}
       	System.out.println("Left rotated matrix:");
       	for(int i=0;i<n;i++){
       	    for(int j=0;j<n;j++){
       	    System.out.print(mat[i][j]+" ");
       	}
       	System.out.println();
       	}
    }

}
