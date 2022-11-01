package Modified;

import java.util.ArrayList;

public class RepeatedUpdated {
    static ArrayList<String> list = new ArrayList<>();
    static String subseq ="";
    public static ArrayList<String> combinationPresent(String str , int index){
        if(subseq.length() > 1) {
            isAlreadyExist(subseq, str.substring(index - 1));
        }
        for (int i = index ; i < str.length() ; i++){
            subseq = subseq + str.charAt(i);
            combinationPresent(str,i+1);
            subseq = subseq.substring(0, subseq.length()-1);
        }
        return list;

    }
    public static void main(String[] args) {
        //xybyaxby
        String str = "abcd";
        combinationPresent(str,0);
        System.out.println(list);
        System.out.println( list.size());

    }
    public static boolean isAlreadyExist(String combinationOfstring, String str){
        int index = -1;
        boolean flag = true;
        for(int i = 0; i < combinationOfstring.length() ; i++){
            str = str.substring(index+1);
            index = str.indexOf(combinationOfstring.charAt(i));
            if(index == -1){
                flag = false;
                break;
            }
        }
        if(flag){
            list.add(combinationOfstring);
//            System.out.println(list);
            return true;
        }
        return false;
    }
}
