
public class Matrix {
    public static int[][] methodToGetMatrix(){
     java.util.Scanner sc = new java.util.Scanner(System.in);
       System.out.println("Enter the rows");
       int r=sc.nextInt();
       System.out.println("Enter the colomn");
       int c=sc.nextInt();
       int [][]matrix=new int[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               matrix[i][j]=sc.nextInt();
           }
       }
       return matrix;
}
   public static void main(String[] args){
      int [][]matrix1=methodToGetMatrix();
      int [][]matrix2=methodToGetMatrix();
      int len=matrix1.length+matrix2.length;
      int [][]multipliedMatrix=new int [matrix1.length][matrix2[1].length];
     for(int i = 0; i < matrix1.length;i++){
            for(int j = 0;j< matrix2[0].length;j++){
                for(int k = 0; k < matrix1.length;k++){
                    multipliedMatrix[i][j]=multipliedMatrix[i][j]+matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(multipliedMatrix[i][j]+" ");
            }
            System.out.println();
        }
   } 
}
