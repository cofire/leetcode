//给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。 
//
// 注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ADOBECODEBANC", t = "ABC"
//输出："BANC"
// 
//
// 示例 2： 
//
// 
//输入：s = "a", t = "a"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, t.length <= 105 
// s 和 t 由英文字母组成 
// 
//
// 
//进阶：你能设计一个在 o(n) 时间内解决此问题的算法吗？ Related Topics 哈希表 字符串 滑动窗口


package leetcode.editor.cn;

import java.util.HashMap;

//Java：最小覆盖子串
public class P76MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new P76MinimumWindowSubstring().new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANCF", "ABC"));
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(solution.minWindow("a", "a"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character, Integer> thm = new HashMap();
            HashMap<Character, Boolean> tf = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                thm.put(t.charAt(i), thm.getOrDefault(t.charAt(i), 0) + 1);
                tf.put(t.charAt(i), true);
            }
            int cnt = 0, L = 0, min_L = 0, min_max = s.length() + 1;
            for (int R = 0; R < s.length(); R++) {
                if (tf.getOrDefault(s.charAt(R), false)) {
                    thm.put(s.charAt(R), thm.get(s.charAt(R)) - 1);
                    if (thm.get(s.charAt(R)) >= 0) {
                        cnt++;
                    }
                    while (cnt == t.length()) {
                        if (R - L + 1 < min_max) {
                            min_L = L;
                            min_max = R - L + 1;
                        }
                        if (tf.getOrDefault(s.charAt(L), false)) {
                            if (thm.get(s.charAt(L)) + 1 > 0) {
                                cnt--;
                            }
                            thm.put(s.charAt(L), thm.getOrDefault(s.charAt(L), 0) + 1);
                        }
                        L++;
                    }
                }
            }
            return min_max > s.length() ? "" : s.substring(min_L, min_max + min_L);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
