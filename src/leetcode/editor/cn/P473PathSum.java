package leetcode.editor.cn;

public class P473PathSum {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNode(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
//        TreeNode root = TreeNode.createTreeNode(new Integer[]{1, null, 2, null, null, null, 3});
        System.out.println(new P473PathSum().pathSum(root, 3));
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val == targetSum) {
            count++;
        }
        if (root.left != null) {
            if (targetSum - root.val != targetSum) {
                count += pathSum(root.left, targetSum);
            }
            count += pathSum(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            if (targetSum - root.val != targetSum) {
                count += pathSum(root.right, targetSum);
            }
            count += pathSum(root.right, targetSum - root.val);
        }
        return count;
    }
}
