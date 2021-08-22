//字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
//
// 
//
// 示例： 
//
// 
//输入：S = "ababcbacadefegdehijhklij"
//输出：[9,7,8]
//解释：
//划分结果为 "ababcbaca", "defegde", "hijhklij"。
//每个字母最多出现在一个片段中。
//像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
// 
//
// 
//
// 提示： 
//
// 
// S的长度在[1, 500]之间。 
// S只包含小写字母 'a' 到 'z' 。 
// 
// Related Topics 贪心 哈希表 双指针 字符串


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Java：划分字母区间
public class P763PartitionLabels {
    public static void main(String[] args) {
        Solution solution = new P763PartitionLabels().new Solution();
        System.out.println(solution.partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(solution.partitionLabels("eccbbbbdec"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> partitionLabels(String s) {
            int[][] rs = new int[26][2];
            int first = s.charAt(0) - 'a';
            for (int i = 1; i < s.length(); i++) {
                int c = s.charAt(i) - 'a';
                if (rs[c][0] == 0 && c != first) {
                    rs[c][0] = i;
                }
                if (i > rs[c][1]) {
                    rs[c][1] = i;
                }
            }
            Arrays.sort(rs, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            List<Integer> ls = new ArrayList<>();
            int begin = 0;
            int end = 0;
            for (int i = 0; i < 26; i++) {
                if (rs[i][0] > end) {
                    ls.add(end - begin + 1);
                    begin = rs[i][0];
                }
                if (rs[i][1] > end) {
                    end = rs[i][1];
                }
            }
            ls.add(end - begin + 1);
            return ls;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
