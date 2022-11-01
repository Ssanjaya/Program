package Modified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TripletUpdate {
    static ArrayList<Integer> ouput =new ArrayList<>();
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,4};
        triplet(arr,0);
//        System.out.println(ouput);
    }
    static void triplet(int [] arr, int index){
//        int index =0;
        if (index == arr.length) {
            if (ouput.size() > 0)
//                System.out.println(ouput);
                if(toCheck(ouput)){
                    System.out.println(ouput);
                }

        }
        else {
            triplet(arr,index+1);
            ouput.add(arr[index]);
            triplet(arr,index+1);
            ouput.remove(ouput.size() - 1);
        }
    }
    static HashMap<Integer,Integer> mapOfEachElement = new HashMap<>();
    static HashMap<ArrayList<Integer>,Integer> mapOfTriplet = new HashMap<>();
    static boolean toCheck(ArrayList<Integer> outputToCheck){
        int value = 1;boolean flag = false;
        int size =outputToCheck.size();
        if(size == 3){
            for(int check : outputToCheck){
                if(!mapOfEachElement.containsKey(check)){
                    mapOfEachElement.put(check,value);
                }
                if(mapOfEachElement.get(check) > 1){
                    flag = false;
                }
                else{
                    flag = true ;
                }
            }int sum =0;
            if(flag){
                for(int add : outputToCheck){
                    sum += add;
                }
                if(sum == 0) {
                    Collections.sort(outputToCheck);
                    if(!mapOfTriplet.containsKey(outputToCheck)){
                        mapOfTriplet.put(outputToCheck,1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
