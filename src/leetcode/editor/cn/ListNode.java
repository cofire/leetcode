package leetcode.editor.cn;

/**
 * @Description
 * @ClassName LinkNode
 * @Author Ly
 * @date 2020.08.05 11:53
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public void print() {
        ListNode tmp = this;
        while (tmp != null) {
            System.out.printf(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }


}
