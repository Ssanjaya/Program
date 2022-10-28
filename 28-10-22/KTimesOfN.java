package Evaluation;

import java.util.HashMap;
import java.util.Scanner;

public class KTimesOfN {
   static HashMap<Integer,Integer> map = new HashMap<>();
    public static void toCheckk(int [] arr , int len , int k){
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
                if(map.get(num) == 2){
                    System.out.println(num);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i< n ;i++){
            arr[i]=sc.nextInt();
        }
        int len = arr.length;
        toCheckk(arr,len,k);
    }
}
