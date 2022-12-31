package aw.some;

import java.util.ArrayList;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 */
public class Scenario48 {

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
            this.right = right;
            this.left = left;
        }
    }

    public static ArrayList<ArrayList<Integer>> getValuesByLevel(Tree root) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Object[]> queue = new ArrayList<>();
        queue.add(new Object[]{root, 0});
        int i = 0;
        while (i < queue.size()) {
            Tree node = (Tree) queue.get(i)[0];
            Integer level = (Integer) queue.get(i)[1];
            i++;
            if (node == null) {
                continue;
            } else {
                if (output.size() <= level) output.add(new ArrayList<>());
                output.get(level).add(node.data);
                queue.add(new Object[]{node.left, level + 1});
                queue.add(new Object[]{node.right, level + 1});
            }
        }
        return output;
    }
}
