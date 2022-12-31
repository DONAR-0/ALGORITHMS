package aw.some;


/**
 * By Always calling height function again:
 * Time complexity: O(n2)
 * Space Complexity: O(n)
 *
 *
 * */
public class Scenario46 {

	public static class Tree {
		int data;
		Tree left;
		Tree right;
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

	public static int height(Tree root){
		if(root == null){
			return 0;
		}
		else {
			return 1 + Math.max(height(root.left),height(root.right)); 
		}
	}

	public static boolean isBalanced(Tree root) {

		if(root == null) return true;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);

	}

	// By Getting heights dynamically
	// Time Complexity: O(n)
	// Space Complexity: O(h)
	public static boolean isBalanced(Tree root,int[] height){
		if (root == null) return true;
		int[] leftHeight = new int[1];
		int[] rightHeight = new int[1];
		boolean isLeftBalanced = isBalanced(root.left, leftHeight);
		boolean isRightBalanced = isBalanced(root.right, rightHeight);
		height[0] = 1 + Math.max(leftHeight[0], rightHeight[0]);
		return Math.abs(leftHeight[0] - rightHeight[0]) <= 1 && isLeftBalanced && isRightBalanced;	
	}


	public static boolean isBalanced_rec(Tree root){
		return isBalanced(root, new int[1]);
	}
}
