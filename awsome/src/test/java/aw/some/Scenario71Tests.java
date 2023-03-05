package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scenario71Tests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario71Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testTree() {
        Scenario71.Tree root = new Scenario71.Tree(1);
        root.left = new Scenario71.Tree(12);
        root.right = new Scenario71.Tree(9);
        root.left.left = new Scenario71.Tree(5);
        root.left.right = new Scenario71.Tree(6);
        root.right.left = new Scenario71.Tree(8);
        root.right.right = new Scenario71.Tree(11);
        LOGGER.info("{}",Scenario71.maxPathSum(root));
    }
}
