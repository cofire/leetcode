//全字母句 指包含英语字母表中每个字母至少一次的句子。 
//
// 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。 
//
// 如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
//输出：true
//解释：sentence 包含英语字母表中每个字母至少一次。
// 
//
// 示例 2： 
//
// 
//输入：sentence = "leetcode"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= sentence.length <= 1000 
// sentence 由小写英语字母组成 
// 
// Related Topics 字符串


package leetcode.editor.cn;

//Java：判断句子是否为全字母句l
public class P1832CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        Solution solution = new P1832CheckIfTheSentenceIsPangram().new Solution();
        System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(solution.checkIfPangram("leetcode"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] rs = new int[26];
            for (int i = 0; i < sentence.length(); i++) {
                rs[sentence.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (rs[i] == 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
