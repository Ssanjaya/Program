
package javaapplication1;


public class Program53 {
    public static void main(String[]args){
        
        String str="a10b13";       
        
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
             char temp=str.charAt(i-1);
             int num=0;
             while (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                 num=num*10+str.charAt(i)-48;
                 i++;
                 for(int j=0;j<num;j++){
                     System.out.print(temp+" ");
                 }
             }
         }   
        }
    }
}
