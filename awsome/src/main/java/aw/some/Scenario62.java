package aw.some;

/**
 * Remove node from Binary Search tree
 */
public class Scenario62 {

    public static class Tree {
        int data;
        Tree left;
        Tree right;
        public Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Tree(int data, Tree left,Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Tree getMinNode(Tree root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public static Tree deleteNodeBst(Tree root,int num) {
        if (root == null) {
            return null;
        } else if (num < root.data) {
            root.left = deleteNodeBst(root.left, num);
        } else if (num > root.data) {
            root.right = deleteNodeBst(root.right,num);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Tree sucessor = getMinNode(root.right);
                root.data = sucessor.data;
                root.right = deleteNodeBst(root.right,sucessor.data);
            }
        }
        return root;
    }
}
