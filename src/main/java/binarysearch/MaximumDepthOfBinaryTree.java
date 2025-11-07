package binarysearch;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(main.java.binarysearch.TreeNode root) {
        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
