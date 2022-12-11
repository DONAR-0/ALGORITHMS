package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reversing a tree")
public class Scenario35Tests {

    @Test
    @DisplayName("TEST_1")
    public void testReverseTree(){
        Scenario35 tree = new Scenario35();
        tree.root = new Scenario35.Tree(1);
        tree.root.left = new Scenario35.Tree(12);
        tree.root.right = new Scenario35.Tree(9);
        tree.root.left.left = new Scenario35.Tree(5);
        tree.root.left.right = new Scenario35.Tree(6);
        /** Debug the code you will get the idea **/
        Scenario35.reverseTree(tree.root);
    }
}
