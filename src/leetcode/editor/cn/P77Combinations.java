//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics 数组 回溯 
// 👍 793 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：组合
public class P77Combinations {
    public static void main(String[] args) {
        Solution solution = new P77Combinations().new Solution();
        System.out.println(solution.combine(4, 2));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            int[] comb = new int[k];
            int count = 0;
            backtracking(ans, comb, count, 1, n, k);
            return ans;
        }

        public void backtracking(List<List<Integer>> ans, int[] comb, int count, int pos, int n, int k) {
            if (count == k) {
                ans.add(numsToList(comb));
                return;
            }
            for (int i = pos; i <= n; i++) {
                comb[count++] = i;
                backtracking(ans, comb, count, i + 1, n, k);
                --count;
            }
        }

        public List<Integer> numsToList(int[] nums) {
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ls.add(nums[i]);
            }
            return ls;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
