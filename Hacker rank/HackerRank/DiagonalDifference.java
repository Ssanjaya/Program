import java.util.Scanner;
class DiagonalDifference {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int[][]matrix=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(i==j)
                    sum1+=matrix[i][j];
                if(i==0 && j==2||i==1 && j==1||i==2 && j==0)
                    sum2+=matrix[i][j];
            }
        }
        int result=sum1-sum2;
        System.out.println(result);

    }
}
