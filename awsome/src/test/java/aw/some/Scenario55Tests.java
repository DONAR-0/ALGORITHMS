package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Scenario55Test
 */

@DisplayName("Flatten a tree")
public class Scenario55Tests {

  @Test
  @DisplayName("TEST_1")
  public void testFlattenTree() {

    Scenario55.Tree root = new Scenario55.Tree(13);
    root.right = new Scenario55.Tree(33);
    root.left = new Scenario55.Tree(12);
    root.left.left = new Scenario55.Tree(9);
    root.right.left = new Scenario55.Tree(24);
    root.right.left.right = new Scenario55.Tree(25);
    root.right.right = new Scenario55.Tree(37);
    root.right.right.right = new Scenario55.Tree(45);
    root.right.right.right.right = new Scenario55.Tree(77);

    Scenario55.flattenTree(root);
    assertThat(root.data, is(equalTo(13)));
    assertThat(root.right.data, is(equalTo(12)));
    assertThat(root.right.right.data, is(equalTo(9)));
  }
}
