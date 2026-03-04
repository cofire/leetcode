package leetcode.editor.cn;

public class P226InvertTree {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        TreeNode left = root.left, right = root.right;
        root.left = right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
