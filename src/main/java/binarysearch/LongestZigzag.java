package main.java.binarysearch;

public class LongestZigzag {
    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        dfs(root.left, true, 1);
        dfs(root.right, false,1);
        return max;
    }
    public void dfs(TreeNode node, boolean lastLeft, int length){
        if(node == null) return;
        max=Math.max(max,length);
        if(lastLeft){
            dfs(node.right, false, length+1);
            dfs(node.left, true, 1);
        }else{
            dfs(node.left, true, length+1);
            dfs(node.right, false, 1);

        }
    }
}