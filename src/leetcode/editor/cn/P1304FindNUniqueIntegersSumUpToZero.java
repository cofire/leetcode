//给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 5
//输出：[-7,-1,1,3,4]
//解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
// 
//
// 示例 2： 
//
// 输入：n = 3
//输出：[-1,0,1]
// 
//
// 示例 3： 
//
// 输入：n = 1
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
// Related Topics 数组


package leetcode.editor.cn;

//Java：和为零的N个唯一整数
public class P1304FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Solution solution = new P1304FindNUniqueIntegersSumUpToZero().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sumZero(int n) {
            int[] rs = new int[n];
            int mid = n / 2;
            for (int i = 0; i < n; i++) {
                if (i - mid >= 0 && n % 2 == 0) {
                    rs[i] = i + 1 - mid;
                } else {
                    rs[i] = i - mid;
                }
            }
            return rs;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
