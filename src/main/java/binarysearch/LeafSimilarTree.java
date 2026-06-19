package main.java.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        addLeaves(root1, list1);
        addLeaves(root2, list2);

        return list1.equals(list2);
    }
    public void addLeaves(TreeNode root, List<Integer> list){
        if(root==null) return;

        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }

        addLeaves(root.left, list);
        addLeaves(root.right, list);


    }
}