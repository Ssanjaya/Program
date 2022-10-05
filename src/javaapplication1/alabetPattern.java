
package javaapplication1;

public class alabetPattern {
        public static void main(String args[]) {
    int n=5;
    for(int i=n;i>=1;i--){
        for(int j=0;j<i;j++){
            System.out.printf("%c",'A'+i-1);
        }
        System.out.println();
    }
    }

}
