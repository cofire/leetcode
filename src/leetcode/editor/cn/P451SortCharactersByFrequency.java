//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。 
//
// 示例 1: 
//
// 
//输入:
//"tree"
//
//输出:
//"eert"
//
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
// 
//
// 示例 2: 
//
// 
//输入:
//"cccaaa"
//
//输出:
//"cccaaa"
//
//解释:
//'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
//注意"cacaca"是不正确的，因为相同的字母必须放在一起。
// 
//
// 示例 3: 
//
// 
//输入:
//"Aabb"
//
//输出:
//"bbAa"
//
//解释:
//此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
//注意'A'和'a'被认为是两种不同的字符。
// 
// Related Topics 哈希表 字符串 桶排序 计数 排序 堆（优先队列） 
// 👍 354 👎 0


package leetcode.editor.cn;

import java.util.HashMap;

//Java：根据字符出现频率排序
public class P451SortCharactersByFrequency {
    public static void main(String[] args) {
        Solution solution = new P451SortCharactersByFrequency().new Solution();
        System.out.println(solution.frequencySort("tree"));
        System.out.println(solution.frequencySort("cccaaa"));
        System.out.println(solution.frequencySort("Aabb"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String frequencySort(String s) {
            if (s == null || s.length() == 0) {
                return null;
            }
            HashMap<Character, Integer> hm = new HashMap<>();
            int size = s.length();
            for (int i = 0; i < size; i++) {
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            int ches = hm.size();
            int[][] sortedRs = new int[ches][2];
            int i = 0;
            for (HashMap.Entry<Character, Integer> entry : hm.entrySet()) {
                sortedRs[i] = new int[]{entry.getKey(), entry.getValue()};
                for (int j = i; j > 0 && sortedRs[j][1] > sortedRs[j - 1][1]; j--) {
                    int[] tmp = sortedRs[j];
                    sortedRs[j] = sortedRs[j - 1];
                    sortedRs[j - 1] = tmp;
                }
                i++;
            }
            StringBuilder rs = new StringBuilder();
            for (int idx = 0; idx < ches; idx++) {
                for (int j = 0; j < sortedRs[idx][1]; j++) {
                    rs.append(Character.toChars(sortedRs[idx][0]));
                }
            }
            return rs.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
