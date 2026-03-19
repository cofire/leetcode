package leetcode.editor.cn;
//Given an integer array nums, find a subarray that has the largest product, 
//and return the product. 
//
// The test cases are generated so that the answer will fit in a 32-bit integer.
// 
//
// Note that the product of an array with a single element is the value of that 
//element. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -10 <= nums[i] <= 10 
// The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
// 
// 
//
// 👍 2554 👎 0


public class P152MaximumProductSubarray {
    public static void main(String[] args) {
        Solution solution = new P152MaximumProductSubarray().new Solution();
        System.out.println(solution.maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(solution.maxProduct(new int[]{-2, 0, -1}));
        System.out.println(solution.maxProduct(new int[]{2, -3, -2, 4}));
        System.out.println(solution.maxProduct(new int[]{2, -3, -2, -4}));
        System.out.println(solution.maxProduct(new int[]{-3, -2, -4}));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int n = nums.length;
            int maxF = nums[0], minF = nums[0], max = nums[0];
            for (int i = 1; i < n; i++) {
                int mm = maxF * nums[i], mn = minF * nums[i];
                maxF = Math.max(mm, Math.max(nums[i], mn));
                minF = Math.min(mm, Math.min(nums[i], mn));
                max = Math.max(maxF, max);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}