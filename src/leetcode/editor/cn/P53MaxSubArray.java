package leetcode.editor.cn;

public class P53MaxSubArray {
    public static void main(String[] args) {
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{1}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{-1, -2}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, 4, -1, -7, 8}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, 4, -7, 8}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, 4, 7, -8}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, 0}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, -1, 1}));
        System.out.println(new P53MaxSubArray().maxSubArray(new int[]{5, -1, 1, 1}));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                if (sum + nums[i] <= 0) {
                    sum = 0;
                    max = Math.max(max, nums[i]);
                } else {
                    sum += nums[i];
                    max = Math.max(max, sum + nums[i]);
                }
            } else {
                if (sum <= 0) {
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
