package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Longest consecutive sequence")
public class Scenario65Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario65Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testLongestConsecutive_1() {
        int[] arr = new int[] {1,2,4,9,12,13,17,8,7,5,6,3};
        LOGGER.info("{}",Scenario65.longestConsecutiveSequence_1(arr));
    }


    @Test
    @DisplayName("TEST_2")
    public void testLongestConsecutive_2() {
        int[] arr = new int[] {1,2,4,9,12,13,17,8,7,5,6,3};
        LOGGER.info("{}",Scenario65.longestConsecutiveSequence_2(arr));
    }


    @Test
    @DisplayName("TEST_3")
    public void testLongestConsecutive_3() {
        int[] arr = new int[] {1,2,4,9,12,13,17,8,7,5,6,3};
        LOGGER.info("{}",Scenario65.longestConsecutiveSequence_3(arr));
    }
}
