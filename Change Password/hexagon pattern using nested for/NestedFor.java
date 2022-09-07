
public class NestedFor {
    public static void main(String []args){
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
                System.out.print("   ");
            for(int j=n-i;j<n;j++)
                System.out.print("*"+"     ");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print("  "+"*"+"  ");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=i;j<=n;j++)
                System.out.print("   ");
            for(int j=n-i;j<n-1;j++)
                System.out.print("*"+"     ");
            System.out.println();
        }
        
    }
}
