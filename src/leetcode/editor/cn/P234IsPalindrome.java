package leetcode.editor.cn;

import java.util.Stack;

public class P234IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode h1 = head;
        while (h1 != null) {
            stack.push(h1);
            h1 = h1.next;
        }
        h1 = head;
        while (h1 != null || !stack.isEmpty()) {
            if (h1.val != stack.pop().val) {
                return false;
            }
            h1 = h1.next;
        }
        return true;
    }
}
