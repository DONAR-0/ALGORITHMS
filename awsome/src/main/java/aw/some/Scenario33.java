package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tree DFS order
 * TC: O(n)
 * SPC: O(n)
 */
public class Scenario33 {

    private Tree root;

    private static final Logger LOG = LoggerFactory.getLogger(Scenario33.class);
    public static class Tree{
        int data;
        Tree left;
        Tree right;

        public Tree() {
            this(0,null,null);
        }

        public Tree(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
       public Tree(int data, Tree left, Tree right){
            this.data =data;
            this.left = left;
            this.right = right;
       }
    }

    static void dfsPreOrder(Tree root){
        if (root == null) return;
        LOG.info("{}",root.data);
        dfsPreOrder(root.left);
        dfsPreOrder(root.right);
    }

    static void dfsInOrder(Tree root){
        if (root == null) return;
        dfsInOrder(root.left);
        LOG.info("{}",root.data);
        dfsInOrder(root.right);
    }


    static void dfsPostOrder(Tree root){
        if (root == null) return;
        dfsPostOrder(root.left);
        dfsPostOrder(root.right);
        LOG.info("{}",root.data);
    }
}
