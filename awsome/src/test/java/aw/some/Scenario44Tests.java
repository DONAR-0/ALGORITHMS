package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@DisplayName("Validate Binary search tree")
public class Scenario44Tests {

  private static final Logger LOG =
      LoggerFactory.getLogger(Scenario44Tests.class);
  @Test
  @DisplayName("Test_1")
  public void testBST_1() {
    // 13,33, 37, 45, 77, 24, 25, 9, 21, 19, 17
    // 13
    // 12   33
    // 9  21   24   37
    //      19  25    45
    //  ...17...........77
    //
    Scenario44.Tree root = new Scenario44.Tree(13);
    root.right = new Scenario44.Tree(33);
    root.left = new Scenario44.Tree(12);
    root.left.left = new Scenario44.Tree(9);
    root.right.left = new Scenario44.Tree(24);
    root.right.left.right = new Scenario44.Tree(25);
    root.right.right = new Scenario44.Tree(37);
    root.right.right.right = new Scenario44.Tree(45);
    root.right.right.right.right = new Scenario44.Tree(77);
    Scenario44.isBst(root);
    LOG.info("{}", Scenario44.isBst(root));
    assertThat(Scenario44.isBst(root), is(Boolean.TRUE));
  }

  @Test
  @DisplayName("Test_2")
  public void testBST_2() {
    Scenario44.Tree root = new Scenario44.Tree(13);
    root.right = new Scenario44.Tree(33);
    root.left = new Scenario44.Tree(12);
    root.left.left = new Scenario44.Tree(9);
    root.right.left = new Scenario44.Tree(24);
    root.right.left.right = new Scenario44.Tree(25);
    root.right.right = new Scenario44.Tree(37);
    root.right.right.right = new Scenario44.Tree(45);
    root.right.right.right.right = new Scenario44.Tree(77);
    Scenario44.isBst(root);
    LOG.info("{}", Scenario44.isBst_2(root));
    assertThat(Scenario44.isBst_2(root), is(Boolean.TRUE));
  }
}
