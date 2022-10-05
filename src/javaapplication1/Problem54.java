
package javaapplication1;

public class Problem54 {
        public static void main(String[] args)
    {
        int[] arr = {13,2,4,15,12,10,5};
        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0) {
                for (int j=i+2;j<arr.length;j+=2) {
                    if (arr[i]<arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            else
            {
                for (int j=i+2;j<arr.length;j+=2) {
                    if (arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
