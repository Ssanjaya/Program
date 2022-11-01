package Modified;

public class Product {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        productOfAll(arr);
    }
    static void productOfAll(int[] array){

        for(int i = 0 ; i< array.length ; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (j != i)
                    product =product* array[j];
//                index = i;
            }
//            product=1;
            System.out.println(product);
        }

    }
}
