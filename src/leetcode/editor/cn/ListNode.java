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

    ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode numsToList(int[] nums) {
        ListNode root = new ListNode(nums[0]);
        ListNode tmp = root;
        for (int i = 1; i < nums.length; i++) {
            tmp.next = new ListNode(nums[i]);
            tmp = tmp.next;
        }
        return root;
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
