package leetcode.editor.cn;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode createTreeNode(Integer[] array) {
        return createTreeNode(array, 1);
    }

    private static TreeNode createTreeNode(Integer[] array, int index) {
        if (index > array.length || array[index - 1] == null) {
            return null;
        }
        TreeNode node = new TreeNode(array[index - 1]);
        node.left = createTreeNode(array, index * 2);
        node.right = createTreeNode(array, index * 2 + 1);
        return node;
    }
}

