package leetcode.editor.cn;
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// Every close bracket has a corresponding open bracket of the same type. 
// 
//
// 
// Example 1: 
//
// 
// Input: s = "()" 
// 
//
// Output: true 
//
// Example 2: 
//
// 
// Input: s = "()[]{}" 
// 
//
// Output: true 
//
// Example 3: 
//
// 
// Input: s = "(]" 
// 
//
// Output: false 
//
// Example 4: 
//
// 
// Input: s = "([])" 
// 
//
// Output: true 
//
// Example 5: 
//
// 
// Input: s = "([)]" 
// 
//
// Output: false 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of parentheses only '()[]{}'. 
// 
//
// 👍 4920 👎 0


import java.util.Stack;

public class P20ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new P20ValidParentheses().new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([])"));
        System.out.println(solution.isValid("([)]"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() <= 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char pre = stack.pop();
                    if ((pre == '(' && ch == ')') || (pre == '[' && ch == ']') || (pre == '{' && ch == '}')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}