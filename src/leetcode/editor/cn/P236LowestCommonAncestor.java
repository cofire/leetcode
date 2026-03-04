package leetcode.editor.cn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P236LowestCommonAncestor {
    public static void main(String[] args) {

    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (p == q || p.left == q || p.right == q) {
            return p;
        }
        if (q.left == p || q.right == p) {
            return q;
        }
        Map<TreeNode, TreeNode> nodeMap = new HashMap<>();
        deepTravel(root, null, nodeMap);
        TreeNode pp1 = p, pp2 = q;
        List<TreeNode> parentNodeListP = new ArrayList<>(), parentNodeListQ = new ArrayList<>();
        while (pp1 != null || pp2 != null) {
            if (pp1 != null) {
                parentNodeListP.add(0, pp1);
                pp1 = nodeMap.get(pp1);
            }
            if (pp2 != null) {
                parentNodeListQ.add(0, pp2);
                pp2 = nodeMap.get(pp2);
            }
        }

        int len = parentNodeListP.size();
        if (len > parentNodeListQ.size()) {
            len = parentNodeListQ.size();
        }
        TreeNode tmp = root;
        for (int i = 0; i < len; i++) {
            if (parentNodeListP.get(i) == parentNodeListQ.get(i)) {
                tmp = parentNodeListP.get(i);
            } else {
                break;
            }
        }

        return tmp;
    }

    public void deepTravel(TreeNode node, TreeNode parentNode, Map<TreeNode, TreeNode> nodeMap) {
        if (node == null) {
            return;
        }
        nodeMap.put(node, parentNode);
        if (node.left != null) {
            deepTravel(node.left, node, nodeMap);
        }
        if (node.right != null) {
            deepTravel(node.right, node, nodeMap);
        }
    }
}
