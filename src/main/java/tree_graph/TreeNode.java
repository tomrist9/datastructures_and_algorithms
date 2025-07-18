package main.java.tree_graph;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public class BinarySearchTree {

        private TreeNode root;

        public BinarySearchTree() {
            root = null;
        }


        public void insert(int value) {
            root = insertRecursive(root, value);
        }


        private TreeNode insertRecursive(TreeNode current, int value) {
            if (current == null) {
                return new TreeNode(value);
            }

            if (value < current.value) {
                current.left = insertRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = insertRecursive(current.right, value);
            } else {
                System.out.println("Value already exists: " + value);
            }

            return current;
        }


        public void inorderTraversal() {
            inorderRecursive(root);
            System.out.println();
        }

        private void inorderRecursive(TreeNode node) {
            if (node != null) {
                inorderRecursive(node.left);
                System.out.print(node.value + " ");
                inorderRecursive(node.right);
            }
        }
    }
}
