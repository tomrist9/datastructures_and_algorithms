package main.java.binarysearch;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSum {
        public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            int answer = 1;
            int level = 1;
            int max = Integer.MIN_VALUE;

            while (!queue.isEmpty()) {
                int size = queue.size();
                int sum = 0;

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    sum += node.val;

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

                if (sum > max) {
                    max = sum;
                    answer = level;
                }

                level++;
            }

            return answer;
        }
}