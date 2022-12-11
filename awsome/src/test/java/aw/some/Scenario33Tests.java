package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing DFS")
public class Scenario33Tests {

    @DisplayName("TEST_1")
    @Test
    public void testDfsPreOrderTree(){
        Scenario33 tree = new Scenario33();
        tree.root = new Scenario33.Tree(1);
        tree.root.left = new Scenario33.Tree(12);
        tree.root.right = new Scenario33.Tree(9);
        tree.root.left.left = new Scenario33.Tree(5);
        tree.root.left.right = new Scenario33.Tree(6);
        Scenario33.dfsPreOrder(tree.root);
    }


    @DisplayName("TEST_2")
    @Test
    public void testDfsInOrderTree(){
        Scenario33 tree = new Scenario33();
        tree.root = new Scenario33.Tree(1);
        tree.root.left = new Scenario33.Tree(12);
        tree.root.right = new Scenario33.Tree(9);
        tree.root.left.left = new Scenario33.Tree(5);
        tree.root.left.right = new Scenario33.Tree(6);
        Scenario33.dfsInOrder(tree.root);
    }

    @DisplayName("TEST_3")
    @Test
    public void testDfsPostOrderTree(){
        Scenario33 tree = new Scenario33();
        tree.root = new Scenario33.Tree(1);
        tree.root.left = new Scenario33.Tree(12);
        tree.root.right = new Scenario33.Tree(9);
        tree.root.left.left = new Scenario33.Tree(5);
        tree.root.left.right = new Scenario33.Tree(6);
        Scenario33.dfsPostOrder(tree.root);
    }
}
