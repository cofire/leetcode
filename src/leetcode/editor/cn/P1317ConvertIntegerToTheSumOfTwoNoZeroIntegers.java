//「无零整数」是十进制表示中 不含任何 0 的正整数。 
//
// 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足： 
//
// 
// A 和 B 都是无零整数 
// A + B = n 
// 
//
// 题目数据保证至少有一个有效的解决方案。 
//
// 如果存在多个有效解决方案，你可以返回其中任意一个。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：[1,1]
//解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
// 
//
// 示例 2： 
//
// 输入：n = 11
//输出：[2,9]
// 
//
// 示例 3： 
//
// 输入：n = 10000
//输出：[1,9999]
// 
//
// 示例 4： 
//
// 输入：n = 69
//输出：[1,68]
// 
//
// 示例 5： 
//
// 输入：n = 1010
//输出：[11,999]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 10^4 
// 
// Related Topics 数学


package leetcode.editor.cn;

//Java：将整数转换为两个无零整数的和
public class P1317ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        Solution solution = new P1317ConvertIntegerToTheSumOfTwoNoZeroIntegers().new Solution();
        System.out.println(solution.getNoZeroIntegers(124));
        System.out.println(solution.getNoZeroIntegers(2));
        System.out.println(solution.getNoZeroIntegers(11));
        System.out.println(solution.getNoZeroIntegers(10000));
        System.out.println(solution.getNoZeroIntegers(69));
        System.out.println(solution.getNoZeroIntegers(1010));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] getNoZeroIntegers(int n) {
            int old = n;
            int A = 0;
            int count = 1;
            int tmp;
            while (n > 0) {
                tmp = n % 10;
                n = n / 10;
                if (tmp >= 2 || n == 0) {
                    A += count;
                    count *= 10;
                    continue;
                }
                if (n > 0) {
                    n = n - 1;
                    A += 2 * count;
                    count *= 10;
                    continue;
                }
            }
            return new int[]{A, old - A};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
