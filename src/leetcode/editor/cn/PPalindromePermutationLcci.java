//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 位运算 哈希表 字符串 
// 👍 68 👎 0


package leetcode.editor.cn;

//Java：回文排列
// 面试题 01.04
public class PPalindromePermutationLcci {
  public static void main(String[] args) {
    Solution solution = new PPalindromePermutationLcci().new Solution();
    System.out.println(solution.canPermutePalindrome("tactcoa"));
    System.out.println(solution.canPermutePalindrome("c"));
    System.out.println(solution.canPermutePalindrome(""));
    System.out.println(solution.canPermutePalindrome("c "));
    System.out.println(solution.canPermutePalindrome("c C"));
    // TO TEST
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean canPermutePalindrome(String s) {
      int[] map = new int[256];
      for (int i = 0; i < s.length(); i++) {
        map[s.charAt(i)]++;
      }
      int cnt = 0;
      for (int i = 0; i < 256; i++) {
        if (map[i] % 2 == 1) {
          cnt++;
        }
      }
      return cnt <= 1;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
