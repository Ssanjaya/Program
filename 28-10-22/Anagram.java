package Evaluation;

import java.util.Scanner;

public class Anagram {
    public static void angramCheck(String stringToCheck) {
        if ((stringToCheck.length() % 2) == 0) {
            int count = 0;
            String sub1=stringToCheck.substring(0, (stringToCheck.length() / 2));
            String sub2 = stringToCheck.substring((stringToCheck.length() / 2), stringToCheck.length());
            char[] array1 = sub1.toCharArray();
            char[] array2 =sub2 .toCharArray();
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count += 2;
                        break;
                    } else if ((j == array2.length - 1) & (array1[i] != array2[j])) {
                        array2[j] = '0';
                        break;
                    }
                }
            }
            System.out.println(count);;
        } else {
            System.out.println(-1);;
        }
    }

    public static void main(String[] args) {
//        System.out.println(angramCheck("abba"));
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        angramCheck(str);

    }
}
