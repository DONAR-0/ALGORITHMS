package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Breadth First Search for both method recursively
 * and iteratively
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 */
public class Scenario42 {
    private static final Logger LOG = LoggerFactory.getLogger(Scenario42.class);
    public static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Tree(int data,Tree left,Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void bfs(Tree roo) {
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(roo);
        int i = 0;
        while (i < queue.size()) {
            Tree poppedNode = queue.get(i++);
            if (poppedNode == null) continue;
            else {
                LOG.info("{}",poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
        }
    }

    public static void bfsRec(Tree root,int i,ArrayList<Tree> queue) {
        if (i >= queue.size()) return;
        else {
            Tree poppedNode = queue.get(i);
            if (poppedNode!= null) {
                LOG.info("{}",poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
            bfsRec(root,i+1,queue);
        }
    }

    public static void bfs_2(Tree root) {
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(root);
        bfsRec(root,0,queue);
    }
}
