package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Scenario56Tests
 */

@DisplayName("Common Ancesstor")
public class Scenario56Tests {

  @Test
  @DisplayName("TEST_1")
  public void testCommonAncestor() {

    Scenario56.Tree root = new Scenario56.Tree(13);
    root.right = new Scenario56.Tree(33);
    root.left = new Scenario56.Tree(12);
    root.left.left = new Scenario56.Tree(9);
    root.right.left = new Scenario56.Tree(24);
    root.right.left.right = new Scenario56.Tree(25);
    root.right.right = new Scenario56.Tree(37);
    root.right.right.right = new Scenario56.Tree(45);
    root.right.right.right.right = new Scenario56.Tree(77);
    Scenario56.lowestCommonAncestor(root, 13, 24);

    assertThat(Scenario56.lowestCommonAncestor(root, 13, 24).data,is(equalTo(13)));
  }
}
