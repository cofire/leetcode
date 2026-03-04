package leetcode.editor.cn;

public class P55CanJump {
    public static void main(String[] args) {
        System.out.println(new P55CanJump().canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new P55CanJump().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new P55CanJump().canJump(new int[]{0}));

    }

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0 || nums[0] < 0) {
            return false;
        }
        int n = nums.length;
        int[] dfs = new int[n];
        dfs[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (dfs[i - 1] <= 0) {
                return false;
            }
            int max = Math.max(dfs[i - 1] - 1, nums[i]);
            dfs[i] = max;
        }
        return dfs[n - 1] >= 0;
    }
}
