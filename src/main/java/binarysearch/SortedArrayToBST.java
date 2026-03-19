package main.java.binarysearch;

import com.sun.source.tree.Tree;
import main.java.binarysearch.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }
    private static TreeNode buildBST(int[] nums, int left, int right){
        if(left > right)
            return null;
        int mid = left+ (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid-1);
        root.right = buildBST(nums, mid+1, right);
        return root;
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int [] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        printLevelOrder(root);
    }
}
