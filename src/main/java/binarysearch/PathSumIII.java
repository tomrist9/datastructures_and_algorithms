package main.java.binarysearch;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int current = dfs(root, targetSum);

        int left = pathSum(root.left, targetSum);
        int right = pathSum(root.right, targetSum);

        return current + left + right;
    }

    public int dfs(TreeNode node, long targetSum) {
        if (node == null) return 0;

        int count = 0;

        if (node.val == targetSum) {
            count++;
        }

        count += dfs(node.left, targetSum - node.val);
        count += dfs(node.right, targetSum - node.val);

        return count;
    }
}