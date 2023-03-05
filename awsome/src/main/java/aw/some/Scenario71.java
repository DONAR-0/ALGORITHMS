package aw.some;

/**
 * Maximum Path Sum
 */
public class Scenario71 {

    static class Tree {
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
            this.right = right;
            this.left = left;
        }
    }

    public static int dfs(Tree root, int[] globalMaxSum) {
        if (root == null) return Integer.MIN_VALUE;
        else {
            int left = dfs(root.left, globalMaxSum);
            int right = dfs(root.right, globalMaxSum);
            if (left == Integer.MIN_VALUE) left = 0;
            if (right == Integer.MIN_VALUE) right = 0;
            int maxFromTop = Math.max(root.data, Math.max(root.data + left, root.data + right));
            int maxNoTop = Math.max(maxFromTop, root.data + left + right);
            globalMaxSum[0] = Math.max(globalMaxSum[0], maxNoTop);
            return maxFromTop;
        }
    }

    public static int maxPathSum(Tree root) {
        int[] globalMaxSum = new int[] {Integer.MIN_VALUE};
        dfs(root,globalMaxSum);
        return globalMaxSum[0];
    }
}