public class coin {
    public static void main(String[] args) {
        int[] nums = {2};
        int amount = 0;
        System.out.println(coin(nums,amount));
    }
    public static int coin(int[] nums, int amount){
        int count = 0;
        int i = nums.length-1;
        if(nums.length==1&&amount>nums[0])
            return -1;
        if(amount==0)
            return 0;
        while(amount>=nums[i]){
            amount = amount - nums[i];
            count++;
        }
        i--;
        while(amount>=nums[i]){
            amount = amount-nums[i];
            count++;
        }
        i--;
        while(amount>=nums[i]){
            amount = amount-nums[i];
            count++;
        }
        return count;
    }
}
