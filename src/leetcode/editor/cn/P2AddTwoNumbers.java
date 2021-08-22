//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


package leetcode.editor.cn;

//Java：两数相加
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        ListNode l1 = new P2AddTwoNumbers().new ListNode(2);
        ListNode tp1 = new P2AddTwoNumbers().new ListNode(4);
        ListNode tp2 = new P2AddTwoNumbers().new ListNode(3);
        tp1.next = tp2;
        l1.next = tp1;
        ListNode l2 = new P2AddTwoNumbers().new ListNode(5);
        ListNode tp3 = new P2AddTwoNumbers().new ListNode(6);
        ListNode tp4 = new P2AddTwoNumbers().new ListNode(4);
        ListNode tp5 = new P2AddTwoNumbers().new ListNode(3);
        tp3.next = tp4;
        tp4.next = tp5;
        l2.next = tp3;
        System.out.println(solution.addTwoNumbers(l1,l2));
        // TO TEST
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode node1 = l1;
            ListNode node2 = l2;
            ListNode sumNode = new ListNode(0);
            ListNode currentNode = sumNode;
            int val1 = 0;
            int val2 = 0;
            while (node1!= null || node2 != null){
                val1 = node1==null?0:node1.val;
                val2 = node2 == null?0:node2.val;
                if(currentNode == null){
                    currentNode = new ListNode(val1+val2);
                }else{
                    currentNode.val = currentNode.val+val1+val2;
                }
                if(currentNode.val >=10){
                    currentNode.next = new ListNode(1);
                    currentNode.val = currentNode.val - 10;
                }
                if(node1 != null){
                    node1 = node1.next;
                }
                if(node2 != null){
                    node2 = node2.next;
                }
                if(node1!=null || node2 != null){
                    if(currentNode.next == null){
                        currentNode.next = new ListNode(0);
                    }
                }
                currentNode = currentNode.next;
            }
            return sumNode;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
