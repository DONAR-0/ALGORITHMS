package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Objects;

@DisplayName("Get Values by level")
public class Scenario48Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario48Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testTree() {
        Scenario48.Tree root = new Scenario48.Tree(1);
        root.left = new Scenario48.Tree(12);
        root.right = new Scenario48.Tree(9);
        root.left.left = new Scenario48.Tree(5);
        root.left.right = new Scenario48.Tree(6);
        root.right.left = new Scenario48.Tree(8);
        root.right.right = new Scenario48.Tree(11);
        LOG.info("{}",Scenario48.getValuesByLevel(root));
    }
}