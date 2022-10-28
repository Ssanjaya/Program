package Evaluation;

import java.util.ArrayList;

public class SumZero {
    static ArrayList<Integer> outputList = new ArrayList();
    static ArrayList<Integer> size = new ArrayList();

    public static void sumComesZero(int[] arr, int index, ArrayList<Integer> subArrays) {
        if (index == arr.length) {
            int sum =0;
            if (subArrays.size() > 0){
            for(int num : subArrays){
                sum = sum+num;
            }
            int max =0,count=0;
            if(sum == 0){
                   count ++;
                if(max < subArrays.size()){
                    max=subArrays.size();
                }
            }

            if(subArrays.size() == max) System.out.println(subArrays);
        }
        }
        else {
            sumComesZero(arr, index + 1, subArrays);
            subArrays.add(arr[index]);
            sumComesZero(arr, index + 1, subArrays);
            subArrays.remove(subArrays.size() - 1);
        }
//        System.out.println(size);

    }

    public static void main(String[] args) {
        int [] arr = {15,-2,2,-8,1,7,10,23};
        sumComesZero(arr,0,outputList);
    }
}
