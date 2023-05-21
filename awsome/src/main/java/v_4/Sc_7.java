package v_4;

import aw.some.Scenario35;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sc_7 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Sc_7.class);

    Tree root;

    /**
     * TC: O(n)
     * SPC: O(1)
     * @param root
     */
    public static void reverseTree(Tree root) {
        if (root == null) return;
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTree(root.left);
        reverseTree(root.right);
    }

    public static void dfsInOrder(Tree root) {
        if (root == null) return;
        dfsInOrder(root.left);
        LOGGER.info("{}",root.data);
        dfsInOrder(root.right);
    }

    public static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void main(String[] args) {
       Sc_7 tree = new Sc_7();
       tree.root = new Sc_7.Tree(1);
       tree.root.left = new Sc_7.Tree(12);
       tree.root.right = new Sc_7.Tree(9);
       tree.root.left.left = new Sc_7.Tree(5);
       tree.root.left.right = new Sc_7.Tree(6);
       Sc_7.dfsInOrder(tree.root);
       Sc_7.reverseTree(tree.root);
       Sc_7.dfsInOrder(tree.root);
    }

}
