package leetcode.editor.cn;

public class P104MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
