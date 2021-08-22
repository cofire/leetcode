//给你一个字符串 num ，表示一个大整数。请你在字符串 num 的所有 非空子字符串 中找出 值最大的奇数 ，并以字符串形式返回。如果不存在奇数，则返回一个
//空字符串 "" 。 
//
// 子字符串 是字符串中的一个连续的字符序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = "52"
//输出："5"
//解释：非空子字符串仅有 "5"、"2" 和 "52" 。"5" 是其中唯一的奇数。
// 
//
// 示例 2： 
//
// 
//输入：num = "4206"
//输出：""
//解释：在 "4206" 中不存在奇数。
// 
//
// 示例 3： 
//
// 
//输入：num = "35427"
//输出："35427"
//解释："35427" 本身就是一个奇数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 105 
// num 仅由数字组成且不含前导零 
// 
// Related Topics 贪心算法 数学 字符串


package leetcode.editor.cn;

//Java：字符串中的最大奇数
public class P1903LargestOddNumberInString {
    public static void main(String[] args) {
        Solution solution = new P1903LargestOddNumberInString().new Solution();
        System.out.println(solution.largestOddNumber("52"));
        System.out.println(solution.largestOddNumber("4206"));
        System.out.println(solution.largestOddNumber("35427"));
        System.out.println(solution.largestOddNumber("3542"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String largestOddNumber(String num) {
            StringBuilder rs = new StringBuilder();
            for (int i = num.length() - 1; i >= 0; i--) {
                if (rs.length() == 0 && num.charAt(i) % 2 == 0) {
                    continue;
                }
                rs.insert(0, num.charAt(i));
            }
            return rs.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
