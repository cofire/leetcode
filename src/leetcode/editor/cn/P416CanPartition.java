package leetcode.editor.cn;

public class P416CanPartition {
    public static void main(String[] args) {
        System.out.println(new P416CanPartition().canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(new P416CanPartition().canPartition(new int[]{1, 2, 3, 5}));
        System.out.println(new P416CanPartition().canPartition(new int[]{1, 2, 3}));
        System.out.println(new P416CanPartition().canPartition(new int[]{1, 2}));
        System.out.println(new P416CanPartition().canPartition(new int[]{1, 1}));
        System.out.println(new P416CanPartition().canPartition(new int[]{1}));
    }

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] | dp[j - num];
            }
        }
        return dp[target];
    }
}
