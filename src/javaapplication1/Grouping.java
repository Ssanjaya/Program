
package javaapplication1;
public class Grouping {
       public static void main(String args[]) {
    int []arr={101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120};
       System.out.println("Group 1:");
    for(int i=0;i<arr.length-1;i+=4){
        System.out.println(arr[i]);
    }
       System.out.println("Group 2:");
    for(int i=1;i<arr.length-1;i+=4){
        System.out.println(arr[i]);
    }
       System.out.println("Group 3:");
    for(int i=2;i<arr.length-1;i+=4){
        System.out.println(arr[i]);
    }
      System.out.println("Group 4:");
    for(int i=3;i<arr.length;i+=4){
        System.out.println(arr[i]);
    }
 
}
}
