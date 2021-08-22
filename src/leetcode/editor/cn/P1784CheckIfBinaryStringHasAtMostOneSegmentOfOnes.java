//给你一个二进制字符串 s ，该字符串 不含前导零 。 
//
// 如果 s 最多包含 一个由连续的 '1' 组成的字段 ，返回 true 。否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "1001"
//输出：false
//解释：字符串中的 1 没有形成一个连续字段。
// 
//
// 示例 2： 
//
// 
//输入：s = "110"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s[i] 为 '0' 或 '1' 
// s[0] 为 '1' 
// 
// Related Topics 贪心算法


package leetcode.editor.cn;

//Java：检查二进制字符串字段
public class P1784CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        Solution solution = new P1784CheckIfBinaryStringHasAtMostOneSegmentOfOnes().new Solution();
        System.out.println(solution.checkOnesSegment("1001"));
        System.out.println(solution.checkOnesSegment("110"));
        System.out.println(solution.checkOnesSegment("11"));
        System.out.println(solution.checkOnesSegment("1"));
        System.out.println(solution.checkOnesSegment("0"));
        System.out.println(solution.checkOnesSegment("00"));
        System.out.println(solution.checkOnesSegment("0001"));

        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkOnesSegment(String s) {
            int countOne = 0;
            int len = s.length();
            int begin = -1;
            int end = -1;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '1') {
                    countOne++;
                    if (begin == -1) {
                        begin = i;
                    }
                    if (i > end) {
                        end = i;
                    }
                }
            }
            if (begin == -1) {
                return false;
            }
            return (end - begin + 1) == countOne;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
