import java.util.Scanner;

public class NameChange {
        public static void namechange(String str){
            char [] charArray=str.toCharArray();
            int len=charArray.length;
            int mid;
            if( len%2 ==0){
                mid=(len/2);
                for (int i = 0, j =0 ; i < len; i++ ,j++) {
                    while( j < mid) {
                        System.out.print(charArray[j]);
                        mid--;
                    }
                    mid=(len/2);
                    while(j>=mid){
                        System.out.print(charArray[j]);
                        mid++;
                    }
                    mid=(len/2);

                }
            }
            else if(len % 2!=0) {
                mid=(len/2);
                for (int i = 0, j =0 ; i < len; i++ ,j++) {
                    while( j < mid) {
                        System.out.print(charArray[j]);
                        mid--;
                    }
                    mid=(len/2);
                    while(j>=mid){
                        System.out.print(charArray[j]);
                        mid++;
                    }
                    mid=(len/2);

                }
            }

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            namechange(name);
            sc.close();
        }
    }


