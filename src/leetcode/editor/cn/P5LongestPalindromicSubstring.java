//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// aaabaaaa
// babaddtattarrattatddetartrateedredividerb
// Related Topics 字符串 动态规划


package leetcode.editor.cn;

//Java：最长回文子串
public class P5LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        String test = "babaddtattarrattatddetartrateedredividerb";
//        System.out.println(solution.isPalindrom(test, 1, 3));
        System.out.println(solution.longestPalindrome(test));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null) {
                return null;
            }
            int[] results = new int[s.length()];
            int length = s.length();
            if (length == 0) {
                return "";
            }
            for (int i = 0; i < length; i++) {
                results[i] = 1;
                for (int j = length - 1; j > i; j--) {
                    if (isPalindrom(s, i, j)) {
                        results[i] = j - i + 1;
                        break;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < length; i++) {
                if (results[i] > results[max]) {
                    max = i;
                }
            }
            return s.substring(max, results[max] + max);
        }

        public boolean isPalindrom(String s, int bengin, int end) {
            int steps = (end - bengin + 1) / 2;
            for (int i = 0; i < steps; i++) {
                if (s.charAt(bengin + i) != s.charAt(end - i)) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
