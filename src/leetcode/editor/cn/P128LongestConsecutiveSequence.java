package leetcode.editor.cn;
//Given an unsorted array of integers nums, return the length of the longest 
//consecutive elements sequence. 
//
// You must write an algorithm that runs in O(n) time. 
//
// 
// Example 1: 
//
// 
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
//Therefore its length is 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
// 
//
// Example 3: 
//
// 
//Input: nums = [1,0,1,2]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 👍 2806 👎 0


import java.util.HashMap;

public class P128LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution solution = new P128LongestConsecutiveSequence().new Solution();
        System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(solution.longestConsecutive(new int[]{1, 0, 1, 2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int n = nums.length;
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(nums[i], false);
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (map.getOrDefault(nums[i], false)) {
                    continue;
                }
                int cnt = 0;
                int p = nums[i];
                while (map.containsKey(p) && !map.getOrDefault(p, false)) {
                    cnt++;
                    map.put(p, true);
                    p++;
                }
                p = nums[i] - 1;
                while (map.containsKey(p) && !map.getOrDefault(p, false)) {
                    cnt++;
                    map.put(p, true);
                    p--;
                }
                max = Math.max(max, cnt);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}