package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scenario70Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario70Tests.class);

    @Test
    @DisplayName("Test Interval array")
    public void testInsertInterval() {
        int[][] intervals = new int[][]{
                {1, 3},
                {4, 7},
                {8, 10},
                {12, 15},
                {16, 17},
                {18, 20},
                {21, 25}
        };
        LOGGER.info("{}", (Object) Scenario70.mergeIntervals(intervals));
    }

}
