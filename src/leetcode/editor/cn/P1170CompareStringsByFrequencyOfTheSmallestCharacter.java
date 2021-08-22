//我们来定义一个函数 f(s)，其中传入参数 s 是一个非空字符串；该函数的功能是统计 s 中（按字典序比较）最小字母的出现频次。 
//
// 例如，若 s = "dcce"，那么 f(s) = 2，因为最小的字母是 "c"，它出现了 2 次。 
//
// 现在，给你两个字符串数组待查表 queries 和词汇表 words，请你返回一个整数数组 answer 作为答案，其中每个 answer[i] 是满足 
//f(queries[i]) < f(W) 的词的数目，W 是词汇表 words 中的词。 
//
// 
//
// 示例 1： 
//
// 输入：queries = ["cbd"], words = ["zaaaz"]
//输出：[1]
//解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。
// 
//
// 示例 2： 
//
// 输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
//输出：[1,2]
//解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= queries.length <= 2000 
// 1 <= words.length <= 2000 
// 1 <= queries[i].length, words[i].length <= 10 
// queries[i][j], words[i][j] 都是小写英文字母 
// 
// Related Topics 数组 字符串


package leetcode.editor.cn;

//Java：比较字符串最小字母出现频次
public class P1170CompareStringsByFrequencyOfTheSmallestCharacter {
    public static void main(String[] args) {
        Solution solution = new P1170CompareStringsByFrequencyOfTheSmallestCharacter().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] count = new int[12];
            for (String word : words)
                count[counts(word)]++;
            for (int i = 9; i >= 0; i--)
                count[i] += count[i + 1];
            int[] result = new int[queries.length];
            for (int i = 0; i < queries.length; i++)
                result[i] = count[counts(queries[i]) + 1];
            return result;
        }

        private int counts(String s) {
            char c = s.charAt(0);
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == c)
                    count++;
                else if (temp < c) {
                    c = temp;
                    count = 1;
                }
            }
            return count;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
