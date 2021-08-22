//给你一个字符串 word ，该字符串由数字和小写英文字母组成。 
//
// 请你用空格替换每个不是数字的字符。例如，"a123bc34d8ef34" 将会变成 " 123 34 8 34" 。注意，剩下的这些整数为（相邻彼此至少有
//一个空格隔开）："123"、"34"、"8" 和 "34" 。 
//
// 返回对 word 完成替换后形成的 不同 整数的数目。 
//
// 只有当两个整数的 不含前导零 的十进制表示不同， 才认为这两个整数也不同。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "a123bc34d8ef34"
//输出：3
//解释：不同的整数有 "123"、"34" 和 "8" 。注意，"34" 只计数一次。
// 
//
// 示例 2： 
//
// 
//输入：word = "leet1234code234"
//输出：2
// 
//
// 示例 3： 
//
// 
//输入：word = "a1b01c001"
//输出：1
//解释："1"、"01" 和 "001" 视为同一个整数的十进制表示，因为在比较十进制值时会忽略前导零的存在。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 1000 
// word 由数字和小写英文字母组成 
// 
// Related Topics 字符串


package leetcode.editor.cn;

import java.util.HashMap;

//Java：字符串中不同整数的数目
public class P1805NumberOfDifferentIntegersInAString {
    public static void main(String[] args) {
        Solution solution = new P1805NumberOfDifferentIntegersInAString().new Solution();
        System.out.println(solution.numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(solution.numDifferentIntegers("leet1234code234"));
        System.out.println(solution.numDifferentIntegers("a1b01c001"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numDifferentIntegers(String word) {
            HashMap<String, Boolean> hm = new HashMap<>();
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (isN(word.charAt(i))) {
                    sb.append(word.charAt(i));
                } else {
                    if (sb.length() > 0) {
                        String s = deleteZero(sb.toString());
                        if (hm.get(s) == null) {
                            cnt++;
                            hm.put(s, true);
                        }
                        sb = new StringBuilder();
                    }
                }
                if (i + 1 == word.length()) {
                    if (sb.length() > 0) {
                        String s = deleteZero(sb.toString());
                        if (hm.get(s) == null) {
                            cnt++;
                            hm.put(s, true);
                            sb = new StringBuilder();
                        }
                    }
                }
            }
            return cnt;
        }

        public String deleteZero(String word) {
            if (word == null || word.length() == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (flag && word.charAt(i) == '0') {
                    continue;
                } else {
                    flag = false;
                    sb.append(word.charAt(i));
                }
            }
            if (sb.length() == 0) {
                return "0";
            } else {
                return sb.toString();
            }
        }

        public boolean isN(char ch) {
            return ch - '0' >= 0 && ch - '0' <= 9;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
