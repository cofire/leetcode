package cofire.sort;

public class BaseSort {
    public static void printNums(int[] nums) {
        if (nums == null) {
            return;
        }
        System.out.print("\n" + nums.toString() + "->");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
