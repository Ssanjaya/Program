
package javaapplication1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mergewithoutrepitation {

    
    public static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB)
    {  
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i=0, j=0, k=0;
        while (i<arrayA.length)
        {
            mergedArray[k] = arrayA[i];
            k++;
            i++;
        }
        while(j<arrayB.length)
        {
            mergedArray[k] = arrayB[j];
            k++;
            j++;
        }        
        Set<Integer> noDuplicates = new HashSet<>();         
        for (int m=0;m<mergedArray.length;m++) 
        {
            noDuplicates.add(mergedArray[m]);
        }        
        Iterator<Integer> it = noDuplicates.iterator();         
        int[] arr4 = new int[noDuplicates.size()];         
        int n = 0;
        while(it.hasNext()) 
        {
            arr4[n] = it.next();
            n++;
        }
        Arrays.sort(arr4);
        return arr4;
    }    
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {7,3,2,7,2,8,9,3,5,6,2,2};         
        int[] arr2 = new int[] {4,5,6,7,1,2,4,8,4,7,2,5,4,32,};         
        int[] mergedArray = mergeArraysAndRemoveDuplicates(arr1, arr2);         
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));         
        System.out.println("Sorted Merged Array With No Duplicates : ");         
        System.out.println(Arrays.toString(mergedArray));   
    }   
}
