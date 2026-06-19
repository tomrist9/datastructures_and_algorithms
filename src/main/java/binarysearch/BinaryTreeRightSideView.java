package main.java.binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }
    public void dfs(TreeNode root, int level, List<Integer> list){
        if(root==null){
            return;
        }

        if(level==list.size()){
            list.add(root.val);
        }

        dfs(root.right, level+1, list);
        dfs(root.left, level+1, list);


    }
}