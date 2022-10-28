package Evaluation;

import java.util.ArrayList;

public class Leader {
    public static void toFindLeader(int [] arr,int len){
        ArrayList<Integer> output = new ArrayList<>();
        output.add(arr[len-1]);
        int leader = arr[len-2];
        for(int i =len-2 ; i > 0 ; i--) {
            for (int j = i - 1; j < len; j++) {
                if (leader < arr[j]) {
                    leader = arr[j];

                } else {
                    output.add(leader);
                    leader = arr[j];
                }
                break;
            }

        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int [] arr ={16,17,4,3,5,2};
        int len = arr.length;
        toFindLeader(arr,len);
    }
}
