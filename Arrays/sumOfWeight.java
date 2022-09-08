
import java.util.HashMap;
import java.util.Scanner;
public class sumOfWeight {
    public static void main(String[] args) {
        String[][] inputArray = {{"Luke", "Shaw"}, {"Wanwy", "rooney"}, {"rooney", "Ronaldo"}, {"Shaw", "rooney"}};
        String foundedName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String name = sc.next();
        int count=0;
        for(int i = 0; i < inputArray.length;i++){
            for(int j = 0;j<=1;j++){
                if(inputArray[i][j].equals(name)){

                    System.out.println(foundedName+=inputArray[i][j-1]);
                }
            }
            for(int k = 1;k <=1;k++){
                if(inputArray[i][k]=="rooney"){
                    count++;
                }
            }
        }
    
        int[] array = {36,49,8,10,12};
        method2(array);
    }
    static void method2(int[] input){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < input.length;i++){
            int sum =0;
            double sqrt=(Math.sqrt(input[i]));
            double perfectSquare = sqrt-Math.floor(sqrt);
            if(perfectSquare==0){
                sum+=5;
            }
             if((input[i]%4==0)&&(input[i]%6==0)){
                sum+= 4;
            }
             if(input[i]%2==0){
                sum+=3;
            }

             int[] res = new int[2*input.length];
             res[i]=sum;
            int temp1 = 0;
            int temp2 = 0;
            for(int y=i+1;y<input.length;y++){
                if(res[i]<res[y]){
                    temp1=res[i];
                    res[i]=res[y];
                    res[y]=temp1;
                    temp2=input[i];
                    input[i]=input[y];
                    input[y]=temp2;
             }
                int[] lastRes = new int[2* input.length];
                for(int s = 0; s < lastRes.length;s+=1){
                    lastRes[i] = res[i] ;
                }
                for(int s = 1; s < lastRes.length;s+=1){
                    lastRes[i] = input[i] ;
                }
                System.out.print(lastRes[i]+",");
                System.out.print(" ");

            }


        }

    }
}
       
    

