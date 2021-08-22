//给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。 
//
// 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
//输出："apple"
// 
//
// 示例 2： 
//
// 
//输入：s = "abpcplea", dictionary = ["a","b","c"]
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// 1 <= dictionary.length <= 1000 
// 1 <= dictionary[i].length <= 1000 
// s 和 dictionary[i] 仅由小写英文字母组成 
// 
// Related Topics 数组 双指针 字符串 排序


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：通过删除字母匹配到字典里最长单词
public class P524LongestWordInDictionaryThroughDeleting {
    public static void main(String[] args) {
        Solution solution = new P524LongestWordInDictionaryThroughDeleting().new Solution();
        ArrayList ls = new ArrayList();
        ls.add("apple");
        System.out.println(solution.findLongestWord("abpcplea", ls));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String findLongestWord(String s, List<String> dictionary) {
            String ans = "";
            for (int i = 0; i < dictionary.size(); i++) {
                String word = dictionary.get(i);
                int p1 = 0;
                int p2 = 0;
                while (p1 < s.length() && p2 < word.length()) {
                    if (s.charAt(p1) == word.charAt(p2)) {
                        p1++;
                        p2++;
                    } else {
                        p1++;
                    }
                }
                if (p2 == word.length() && (word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0))) {
                    ans = word;
                }

            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
