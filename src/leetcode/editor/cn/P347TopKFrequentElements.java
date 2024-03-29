//给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
//
//
//
// 示例 1:
//
//
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
//
//
// 示例 2:
//
//
//输入: nums = [1], k = 1
//输出: [1]
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 105
// k 的取值范围是 [1, 数组中不相同的元素的个数]
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
//
//
//
//
// 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。
// Related Topics 数组 哈希表 分治 桶排序 计数 快速选择 排序 堆（优先队列）


package leetcode.editor.cn;

import cofire.sort.BaseSort;

import java.util.HashMap;

//Java：前 K 个高频元素
public class P347TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new P347TopKFrequentElements().new Solution();
        // TO TEST
        int[] nums = new int[]{1, 2, 3, 2, 4, 5, 6, 2, 1, 4, 1, 2, 3};
        BaseSort.printNums(solution.topKFrequent(nums, 1));
        BaseSort.printNums(solution.topKFrequent(nums, 2));
        BaseSort.printNums(solution.topKFrequent(nums, 3));
        BaseSort.printNums(solution.topKFrequent(nums, 4));
        BaseSort.printNums(solution.topKFrequent(nums, 5));
        BaseSort.printNums(solution.topKFrequent(nums, 6));
        BaseSort.printNums(solution.topKFrequent(new int[]{1}, 1));
        BaseSort.printNums(solution.topKFrequent(new int[]{1}, 2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k <= 0) {
                return null;
            }
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
            int num = hm.size();
            int[][] sortedRs = new int[num][2];
            int i = 0;
            for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
                sortedRs[i] = new int[]{entry.getKey(), entry.getValue()};
                for (int j = i; j > 0 && sortedRs[j][1] > sortedRs[j - 1][1]; j--) {
                    int[] tmp = sortedRs[j];
                    sortedRs[j] = sortedRs[j - 1];
                    sortedRs[j - 1] = tmp;
                }
                i++;
            }
            int rs = k;
            if (rs > num) {
                rs = num;
            }
            int[] ans = new int[rs];
            for (int idx = 0; idx < rs; idx++) {
                ans[idx] = sortedRs[idx][0];
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
