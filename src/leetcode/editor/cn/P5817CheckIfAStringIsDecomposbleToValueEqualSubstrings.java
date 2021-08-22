//null


package leetcode.editor.cn;

//Java：Check If a String is Decomposble to Value-Equal Substrings
public class P5817CheckIfAStringIsDecomposbleToValueEqualSubstrings {
    public static void main(String[] args) {
        Solution solution = new P5817CheckIfAStringIsDecomposbleToValueEqualSubstrings().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isDecomposable(String s) {
            int i = 0, two = 0;
            while (i < s.length()) {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
                if ((j - i) % 3 == 1) return false;
                if ((j - i) % 3 == 2) two++;
                i = j;
            }
            return two == 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
