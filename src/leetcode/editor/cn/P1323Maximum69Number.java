//给你一个仅由数字 6 和 9 组成的正整数 num。 
//
// 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。 
//
// 请返回你可以得到的最大数字。 
//
// 
//
// 示例 1： 
//
// 输入：num = 9669
//输出：9969
//解释：
//改变第一位数字可以得到 6669 。
//改变第二位数字可以得到 9969 。
//改变第三位数字可以得到 9699 。
//改变第四位数字可以得到 9666 。
//其中最大的数字是 9969 。
// 
//
// 示例 2： 
//
// 输入：num = 9996
//输出：9999
//解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。 
//
// 示例 3： 
//
// 输入：num = 9999
//输出：9999
//解释：无需改变就已经是最大的数字了。 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10^4 
// num 每一位上的数字都是 6 或者 9 。 
// 
// Related Topics 数学


package leetcode.editor.cn;

//Java：6 和 9 组成的最大数字
public class P1323Maximum69Number {
    public static void main(String[] args) {
        Solution solution = new P1323Maximum69Number().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximum69Number(int num) {
            int old = num;
            int index = 0;
            int max = -1;
            while (num > 0) {
                if (num % 10 == 6) {
                    max = index;
                }
                index++;
                num /= 10;
            }
            if (max == -1) {
                return old;
            }
            return (int) (old + 3 * Math.pow(10, max));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
