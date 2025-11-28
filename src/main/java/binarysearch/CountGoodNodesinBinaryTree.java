package main.java.binarysearch;

public class CountGoodNodesinBinaryTree {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxFar) {
        if (node == null) return 0;

        int count = 0;

        if (node.val >= maxFar) {
            count++;
        }
        int newMax = Math.max(node.val, maxFar);

        count += dfs(node.left, newMax);
        count += dfs(node.right, newMax);

        return count;
    }
}
