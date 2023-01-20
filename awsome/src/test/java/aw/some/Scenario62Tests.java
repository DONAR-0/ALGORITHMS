package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
@DisplayName("Test delete node from tree")
public class Scenario62Tests {

    @Test
    @DisplayName("TEST_1")
    public void testTree(){

        Scenario62.Tree root = new Scenario62.Tree(13);
        root.right = new Scenario62.Tree(33);
        root.left = new Scenario62.Tree(12);
        root.left.left = new Scenario62.Tree(9);
        root.right.left = new Scenario62.Tree(24);
        root.right.left.right = new Scenario62.Tree(25);
        root.right.right = new Scenario62.Tree(37);
        root.right.right.right = new Scenario62.Tree(45);
        root.right.right.right.right = new Scenario62.Tree(77);

        assertThat(Scenario62.deleteNodeBst(root,37).data,is(equalTo(13)));
        assertThat(Scenario62.deleteNodeBst(root,37).right.right.data,is(equalTo(45)));

    }
}
