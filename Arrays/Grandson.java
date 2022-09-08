
import java.util.Scanner;


public class Grandson {
     public static void main(String[] args) {
        String[][] inputArray = {{"Luke", "Shaw"}, {"Wanwy", "rooney"}, {"rooney", "Ronaldo"}, {"Shaw", "rooney"}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name who's grandchildren need to be found: ");
        String name = sc.next();
        int countOfGrandchildren=0;
        String son = "";
        for(int i= 0;i<inputArray.length;i++){
            for(int j = 0;j<=1;j++){
                if(inputArray[i][j].equalsIgnoreCase(name)){
                    System.out.println(son+=inputArray[i][j-1]);
                }
            }
            String grandchild =son;
            for(int k = 1;k <=1;k++){
                if(inputArray[i][k].equals(grandchild)){
                    countOfGrandchildren++;
                }
            }
        }
    
}
}
