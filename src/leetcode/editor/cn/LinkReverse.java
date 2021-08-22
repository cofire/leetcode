package leetcode.editor.cn;

/**
 * @Description
 * @ClassName LinkReverse
 * @Author Ly
 * @date 2020.08.05 11:53
 */
public class LinkReverse {
    public static ListNode reverseListByInsert(ListNode listNode) {
        ListNode head = new ListNode(-1);
        ListNode p = listNode;
        while (p != null) {
            ListNode tmp = p.next;
            p.next = head.next;
            head.next = p;
            p = tmp;
        }
        return head.next;
    }

    public static ListNode reverseListByLocal(ListNode listNode) {
        ListNode resultList = new ListNode(-1);
        resultList.next = listNode;
        ListNode p = listNode;
        ListNode pNext = p.next;
        while (pNext != null) {
            p.next = pNext.next;
            pNext.next = resultList.next;
            resultList.next = pNext;
            pNext = p.next;
        }
        return resultList.next;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.print();
        reverseListByLocal(node1).print();
    }
}
