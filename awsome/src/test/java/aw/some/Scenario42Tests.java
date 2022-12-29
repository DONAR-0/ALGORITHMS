package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BFS ")
public class Scenario42Tests {

    @Test
    @DisplayName("TEST_1")
    public void testTree() {
        Scenario42.Tree root = new Scenario42.Tree(1);
        root.left = new Scenario42.Tree(12);
        root.right = new Scenario42.Tree(9);
        root.left.left = new Scenario42.Tree(5);
        root.left.right = new Scenario42.Tree(6);
        root.right.left = new Scenario42.Tree(8);
        root.right.right = new Scenario42.Tree(11);
        Scenario42.bfs(root);
    }


    @Test
    @DisplayName("TEST_2")
    public void testTree_2() {
        Scenario42.Tree root = new Scenario42.Tree(1);
        root.left = new Scenario42.Tree(12);
        root.right = new Scenario42.Tree(9);
        root.left.left = new Scenario42.Tree(5);
        root.left.right = new Scenario42.Tree(6);
        root.right.left = new Scenario42.Tree(8);
        root.right.right = new Scenario42.Tree(11);
        Scenario42.bfs_2(root);
    }
}
