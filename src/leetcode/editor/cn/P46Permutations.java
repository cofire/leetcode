//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 
// 👍 1685 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：全排列
public class P46Permutations {
    public static void main(String[] args) {
        Solution solution = new P46Permutations().new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3, 4}));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            backtracking(nums, 0, ans);
            return ans;
        }

        public void backtracking(int[] nums, int level, List<List<Integer>> ans) {
            if (level == nums.length - 1) {
                ans.add(numsToList(nums));
                return;
            }
            for (int i = level; i < nums.length; i++) {
                swap(nums, i, level);
                backtracking(nums, level + 1, ans);
                swap(nums, i, level);
            }
        }

        public List<Integer> numsToList(int[] nums) {
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ls.add(nums[i]);
            }
            return ls;
        }

        public void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
