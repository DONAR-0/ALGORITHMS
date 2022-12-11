package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scenario35 {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario35.class);

    Tree root;

    public static void reverseTree(Tree root) {
        if (root == null) return;
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTree(root.left);
        reverseTree(root.right);
    }
    public static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(){
            this(0,null,null);
        }
        public Tree(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Tree(int data,Tree left,Tree right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}