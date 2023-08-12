package v_4;

import java.util.ArrayList;

public class Sc_14 {

    public static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Tree(int data, Tree left, Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * O(n)
     * O(n)
     *
     * @param root
     */
    public static void bfs(Tree root) {
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(root);
        int i = 0;
        while (i < queue.size()) {
            Tree poppedNode = queue.get(i++) ;
            if (poppedNode == null) continue;
            else {
                System.out.print(poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
        }
    }

    public static void bfsR(Tree root,int i,ArrayList<Tree> queue) {
        if (i >= queue.size()) return;
        else {
            Tree poppedTree = queue.get(i);
            if (poppedTree!= null) {
                System.out.print(poppedTree.data +"=>");
                queue.add(poppedTree.left);
                queue.add(poppedTree.right);
            }
            bfsR(root,i + 1,queue);
        }
    }

    public static void bfsR(Tree root) {
        ArrayList<Tree> queue= new ArrayList<>();
        queue.add(root);
        bfsR(root,0,queue);
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(42);
        root.right = new Tree(12);
        root.left.left = new Tree(10);
        root.left.right = new Tree(9);
        root.left.left.left = new Tree(5);
        root.left.left.right = new Tree(6);
        root.left.right.left = new Tree(8);
        root.left.right.right = new Tree(11);
        bfs(root);
        bfsR(root);
    }
}
