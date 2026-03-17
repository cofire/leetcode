package leetcode.editor.cn;

public class P141HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
            if (p2 == null) {
                return false;
            }
            p2 = p2.next;
            if (p1 == p2) {
                return true;
            }
        }

        return false;
    }
}
