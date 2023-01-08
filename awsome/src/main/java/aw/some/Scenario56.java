package aw.some;

import java.util.ArrayList;

/**
 * Scenario56
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 *
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

    public Tree(int data, Tree left, Tree right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static boolean getPath(Tree root, ArrayList<Tree> path, int num) {
    if (root == null)
      return false;
    path.add(root);
    if (root.data == num)
      return true;
    if (getPath(root.left, path, num) || getPath(root.right, path, num)) {
      return true;
    }
    path.remove(path.size() - 1);
    return false;
  }

  public static Tree lowestCommonAncestor(Tree root, int num1, int num2) {
    ArrayList<Tree> pathNum1 = new ArrayList<Tree>();
    ArrayList<Tree> pathNum2 = new ArrayList<Tree>();
    if (!getPath(root, pathNum1, num1) || !getPath(root, pathNum2, num2)) {
      return null;
    }
    int minLegth = Math.min(pathNum1.size(), pathNum2.size());
    int i = 0;
    while (i < minLegth) {
      if (pathNum1.get(i).data == pathNum2.get(i).data)
        i++;
      else
        break;
    }
    return pathNum1.get(i - 1);
  }

  /**
   * by checking if num1 is on the left and num2 is on the right or the opposite
   *
   * Time Complexity: O(n)
   * Space Complexity: O(h)
   *
   * */
  public static Tree lowestCommonAncestor_2(Tree root, int num1, int num2) {
    if (root == null)
      return null;
    if (root.data == num1 || root.data == num2)
      return root;
    Tree leftLCA = lowestCommonAncestor(root.left, num1, num2);
    Tree rightLCA = lowestCommonAncestor(root.right, num1, num2);
    if (leftLCA != null && rightLCA != null)
      return root;
    return leftLCA != null ? leftLCA : rightLCA;
  }
}
