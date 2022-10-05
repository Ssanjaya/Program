import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target)
                    return new int[]{i, j};

            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] output = twoSum(arr, target);
        for (int i = 0; i < output.length; i++)
            System.out.println(output[i]);
    }
}
