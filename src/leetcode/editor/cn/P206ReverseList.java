package leetcode.editor.cn;

public class P206ReverseList {
    public static void main(String[] args) {
//        ListNode head = ListNode.numsToList(new int[]{1, 2, 3, 4, 5});
//        ListNode head = ListNode.numsToList(new int[]{1, 2, 3, 4});
//        ListNode head = ListNode.numsToList(new int[]{1, 2, 3});
//        ListNode head = ListNode.numsToList(new int[]{1, 2});
        ListNode head = ListNode.numsToList(new int[]{1});
        head.print();
        new P206ReverseList().reverseList(head).print();

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode p = head;
        while (p.next != null) {
            ListNode next = p.next;
            p.next = next.next;
            next.next = newHead.next;
            newHead.next = next;
        }
        return newHead.next;
    }
}
