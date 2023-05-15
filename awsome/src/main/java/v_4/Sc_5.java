package v_4;

import aw.some.Scenario33;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tree DFS order
 * TC: O(n)
 * SPC: O(n)
 *
 */
public class Sc_5 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sc_5.class);
    Tree root;
    public static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree() {this(0,null,null);}

        public Tree(int data) {
            this(data,null,null);
        }

        public Tree(int data,Tree left,Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void dfsPreOrder(Tree root) {
        if (root == null) return;
        LOGGER.info("{}",root.data);
        dfsPreOrder(root.left);
        dfsPreOrder(root.right);
    }

    public static void dfsInOrder(Tree root) {
        if (root == null) return;
        dfsInOrder(root.left);
        LOGGER.info("{}",root.data);
        dfsInOrder(root.right);
    }

    public static void dfsPostOrder(Tree root) {
        if (root == null) return;
        dfsPostOrder(root.left);
        dfsPostOrder(root.right);
        LOGGER.info("{}",root.data);
    }

    public static void main(String[] args) {
        Sc_5 tree= new Sc_5();
        tree.root = new Tree(1);
        tree.root.left = new Tree(12);
        tree.root.right = new Tree(9);
        tree.root.left.left = new Tree(5);
        tree.root.left.right = new Tree(6);
        Sc_5.dfsInOrder(tree.root);
        Sc_5.dfsPreOrder(tree.root);
        Sc_5.dfsPostOrder(tree.root);

    }
}