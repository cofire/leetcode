//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串


package leetcode.editor.cn;

import java.util.HashMap;

//Java：“气球” 的最大数量
public class P1189MaximumNumberOfBalloons {
    public static void main(String[] args) {
        Solution solution = new P1189MaximumNumberOfBalloons().new Solution();
        System.out.println(solution.maxNumberOfBalloons("nlaebolko"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxNumberOfBalloons(String text) {
            if (text == null || text.length() < 7) {
                return 0;
            }
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                hm.put(text.charAt(i), hm.getOrDefault(text.charAt(i), 0) + 1);
            }
            int min = hm.getOrDefault('b', 0);
            if (min > hm.getOrDefault('a', 0)) {
                min = hm.getOrDefault('a', 0);
            }
            if (min > hm.getOrDefault('l', 0) / 2) {
                min = hm.getOrDefault('l', 0) / 2;
            }
            if (min > hm.getOrDefault('o', 0) / 2) {
                min = hm.getOrDefault('o', 0) / 2;
            }
            if (min > hm.getOrDefault('n', 0)) {
                min = hm.getOrDefault('n', 0);
            }
            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
