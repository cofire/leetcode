package leetcode.editor.cn;
//Given the root of a binary tree, return the inorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
// Input: root = [1,null,2,3] 
// 
//
// Output: [1,3,2] 
//
// Explanation: 
//
// 
//
// Example 2: 
//
// 
// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9] 
// 
//
// Output: [4,2,6,5,7,1,3,9,8] 
//
// Explanation: 
//
// 
//
// Example 3: 
//
// 
// Input: root = [] 
// 
//
// Output: [] 
//
// Example 4: 
//
// 
// Input: root = [1] 
// 
//
// Output: [1] 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
// 👍 2397 👎 0


import java.util.ArrayList;
import java.util.List;

public class P94BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new P94BinaryTreeInorderTraversal().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ls = new ArrayList<>();
            inorderTraversal(root, ls);
            return ls;
        }

        public void inorderTraversal(TreeNode root, List<Integer> ls) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left, ls);
            ls.add(root.val);
            inorderTraversal(root.right, ls);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}