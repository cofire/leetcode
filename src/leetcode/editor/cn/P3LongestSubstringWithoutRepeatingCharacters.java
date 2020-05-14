//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


package leetcode.editor.cn;
//Java：无重复字符的最长子串
public class P3LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new P3LongestSubstringWithoutRepeatingCharacters().new Solution();
        String test = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(test));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() <=0){
            return 0;
        }
        int length = s.length();
        int[] result = new int[length];
        result[0] = 1;
        for(int i =1; i< length;i++){
            char ch = s.charAt(i);
            String temp = s.substring(i-result[i-1],i+1);
            if(temp.indexOf(ch) == temp.length()-1){
                result[i] = result[i-1]+1;
            }else{
                result[i] = result[i-1] - temp.indexOf(ch);
            }
        }
        int max = 0;
        for(int i=0;i<length;i++){
            if(result[i]>max){
                max = result[i];
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
