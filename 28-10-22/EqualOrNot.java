package Evaluation;

import java.util.HashMap;
import java.util.Scanner;

public class EqualOrNot {

   public static void toCheckEqualOrNot(String str1 ,String str2 ){
       HashMap<Character,Integer> map = new HashMap<>();
       char [] charArray1 = str1.toCharArray();
       char[] charArray2 =str2.toCharArray();
       for(char charInIt: charArray1){
           if(!map.containsKey(charInIt)){
               map.put(charInIt,1);
           }else{
               map.put(charInIt,map.get(charInIt)+1);

           }
       }
       for(char charInIt: charArray2){
           if(!map.containsKey(charInIt)){
               map.put(charInIt,1);
           }else{
               map.put(charInIt,map.get(charInIt)+1);

           }
       }
//       System.out.println(map);
       for(char ch : charArray1){
           if(map.get(ch)%2 != 0){
               System.out.println("NOT EQUAL");
               break;
           }else{ System.out.println("EQUAL"); break;}
       }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 =sc.next();
        String str2 =sc.next();
        toCheckEqualOrNot(str1,str2);
    }
}
