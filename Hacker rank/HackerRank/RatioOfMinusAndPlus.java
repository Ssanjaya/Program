public class RatioOfMinusAndPlus {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 5, 6, 0, -3 };
        int n=arr.length;
        float plus=0,minus=0,zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0)
                plus++;
            if(arr[i]<0)
                minus++;
            if(arr[i]==0)
                zero++;
        }
        System.out.printf("%1.5f ",plus/n);
        System.out.printf("%1.5f ",minus/n);
        System.out.printf("%1.5f ",zero/n);
    }
}
