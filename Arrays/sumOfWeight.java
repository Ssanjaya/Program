public class Weight {
    public static void main(String[] args){
        int[] array = {36, 49, 9, 16, 25};
        int[] sumOfWeight = new int[array.length];
        for(int i = 0; i < array.length;i++){
            double sqrt=Math.sqrt(array[i]);
            double perfectSquare=(sqrt)- Math.floor(sqrt);
            if(perfectSquare ==0){
                sumOfWeight[i]+=5;
            }
            if((array[i]%4==0)&&(array[i]%6==0)){
                sumOfWeight[i]+=4;
            }
            if(array[i]%2==0){
                sumOfWeight[i]+=3;
            }
        }
        for(int i = 0; i < array.length-1;i++){
            for(int j = i +1; j< array.length;j++){
                if(sumOfWeight[i]<sumOfWeight[j]){
                    int temp1 = sumOfWeight[i];
                    sumOfWeight[i]=sumOfWeight[j];
                    sumOfWeight[j]=temp1;
                    int temp2 = array[i];
                    array[i]=array[j];
                    array[j]=temp2;
                }
            }
        }
        for(int i = 0; i < array.length;i++){
            System.out.print("<"+array[i]+","+sumOfWeight[i]+">"+" ");
        }
    }
}
