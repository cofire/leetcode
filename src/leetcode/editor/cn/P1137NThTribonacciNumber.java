//泰波那契序列 Tn 定义如下： 
//
// T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2 
//
// 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。 
//
// 
//
// 示例 1： 
//
// 输入：n = 4
//输出：4
//解释：
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
// 
//
// 示例 2： 
//
// 输入：n = 25
//输出：1389537
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 37 
// 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。 
// 
// Related Topics 递归


package leetcode.editor.cn;

//Java：第 N 个泰波那契数
public class P1137NThTribonacciNumber {
    public static void main(String[] args) {
        Solution solution = new P1137NThTribonacciNumber().new Solution();
        System.out.println(solution.tribonacci(0));
        System.out.println(solution.tribonacci(1));
        System.out.println(solution.tribonacci(2));
        System.out.println(solution.tribonacci(3));
        System.out.println(solution.tribonacci(4));
        System.out.println(solution.tribonacci(5));
        System.out.println(solution.tribonacci(6));
        System.out.println(solution.tribonacci(7));
        System.out.println(solution.tribonacci(25));
        System.out.println(solution.tribonacci(37));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public Integer[] rs = new Integer[38];

        public int tribonacci(int n) {
            if (n == 0) {
                rs[0] = 0;
                return rs[0];
            }
            if (n <= 2) {
                rs[n] = 1;
                return rs[n];
            }
            if (rs[n - 1] == null) {
                tribonacci(n - 1);
            }
            if (rs[n - 2] == null) {
                tribonacci(n - 2);
            }
            if (rs[n - 3] == null) {
                tribonacci(n - 3);
            }
            rs[n] = rs[n - 1] + rs[n - 2] + rs[n - 3];
            return rs[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
