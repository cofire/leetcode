package leetcode.editor.cn;

public class P23MergeKLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        boolean allNull = false;
        ListNode newHeader = new ListNode();
        ListNode p = newHeader;
        int n = lists.length;
        while (!allNull) {
            ListNode minNode = null;
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (lists[i] != null) {
                    if (minNode == null || lists[i].val < minNode.val) {
                        index = i;
                        minNode = lists[i];
                    }
                }
            }
            if (minNode == null) {
                allNull = true;
            } else {
                p.next = minNode;
                p = p.next;
                lists[index] = minNode.next;
            }
        }
        return newHeader.next;
    }
}
