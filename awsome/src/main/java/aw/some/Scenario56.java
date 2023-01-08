package aw.some;

import java.util.ArrayList;

/**
* Scenario56
*/
public class Scenario56 {

	public static class Tree {
		int data;
		Tree left;
		Tree right;
		
		public Tree(int data) {
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

	public static boolean getPath(Tree root,ArrayList<Tree> path,int num){
		if(root == null) return false;
		path.add(root);
		if(root.data == num) return true;
		if(getPath(root.left, path, num) || getPath(root.right, path, num)){
			return true;
		}
		path.remove(path.size() - 1);
		return false;
	}
	
	public static Tree lowestCommonAncestor(Tree root,int num1,int num2){
		ArrayList<Tree> pathNum1 = new ArrayList<Tree>();
		ArrayList<Tree> pathNum2 = new ArrayList<Tree>();
		if(!getPath(root, pathNum1, num1) || !getPath(root, pathNum2, num2)){
			return null;
		}
		return root;
	}

}
