package leetcode.editor.cn;

public class P19RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode root = new ListNode().numsToList(new int[]{1, 2});
        root.print();
        new P19RemoveNthFromEnd().removeNthFromEnd(root, 2).print();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        ListNode newHead = new ListNode();
        newHead.next = head;

        ListNode p = newHead;
        int size = 0;
        while (p != null) {
            p = p.next;
            size++;
        }

        p = newHead;
        int step = size - n - 1;
        while (step > 0) {
            p = p.next;
            step--;
        }

        ListNode toDelete = p.next;
        p.next = toDelete.next;
        return newHead.next;
    }
}
