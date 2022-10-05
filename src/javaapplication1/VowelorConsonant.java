
package javaapplication1;

import java.util.Scanner;

public class VowelorConsonant {
       public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the character:" );
       char a=sc.next().charAt(0);
       if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
         System.out.println("Entered Chracter is a Vowel" );
       else
         System.out.println("Entered character is a consonant" );
       
      
    }

}
