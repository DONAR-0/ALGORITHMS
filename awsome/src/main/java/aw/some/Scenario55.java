package aw.some;

public class Scenario55 {

	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(h)
	 *
	 * */
	public static class Tree{
		int data;
		Tree left;
		Tree right;
		public Tree(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public Tree (int data,Tree left,Tree right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	/**
	* Flatten the Tree 
	*
	*
	* @param root
	*/
	public static void flattenTree(Tree root){
		if (root == null) return;
		else {
			flattenTree(root.left);
			flattenTree(root.right);
			Tree rightSubTree = root.right;
			root.right = root.left;
			root.left = null;
			Tree temp = root;
		while(temp.right != null){
				temp = temp.right;
			}
			temp.right = rightSubTree;
		}
	}
}
