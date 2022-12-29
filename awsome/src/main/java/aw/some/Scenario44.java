package aw.some;

/**
 * Validate if tree is binary search tree
 * By Recursively checking if every node respects its own range.
 * for both the methods
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Scenario44 {

    public static class Tree{
        int data;
        Tree left;
        Tree right;

        public Tree(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }

        public Tree(int data,Tree left,Tree right){
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }

    public static boolean isBst(Tree root,int min,int max){
        if (root == null) return true;
        else if (root.data <= min || root.data >= max) {
            return false;
        }
        else {
            return isBst(root.left,min,root.data) && isBst(root.right,root.data,max);
        }
    }

    public static boolean isBst(Tree root){
        return isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    /**
     * Check using recursion
     * By checking if values are sorted when performing an inorder traversal
     *
     * @param root root of the issue
     * @return boolean
     */
    public static boolean isBst_2(Tree root){
       int[] precedent = new int[] {Integer.MIN_VALUE};
       return isBstRec(root,precedent);
    }

    private static boolean isBstRec(Tree root, int[] precedent) {
        if (root == null) return true;
        if (!isBstRec(root.left,precedent)) return false;
        if (root.data <= precedent[0]) return false;
        else precedent[0] = root.data;
        if (!isBstRec(root.right,precedent)) return false;
        return true;
    }
}
