package leetcode.editor.cn;
//You are given an array of integers nums, there is a sliding window of size k 
//which is moving from the very left of the array to the very right. You can only 
//see the k numbers in the window. Each time the sliding window moves right by one 
//position. 
//
// Return the max sliding window. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
//Explanation: 
//Window position                Max
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
// 
//
// Example 2: 
//
// 
//Input: nums = [1], k = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 1 <= k <= nums.length 
// 
//
// 👍 3428 👎 0


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P239SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new P239SlidingWindowMaximum().new Solution();
        System.out.println(Arrays.asList(solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k <= 0) {
                return null;
            }
            PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
                }
            });
            for (int i = 0; i < k; i++) {
                pq.offer(new int[]{nums[i], i});
            }
            int n = nums.length;
            int[] result = new int[n - k + 1];
            result[0] = pq.peek()[0];
            for (int i = k; i < n; i++) {
                pq.offer(new int[]{nums[i], i});
                while (pq.peek()[1] < i - k + 1) {
                    pq.poll();
                }
                result[i - k + 1] = pq.peek()[0];
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}