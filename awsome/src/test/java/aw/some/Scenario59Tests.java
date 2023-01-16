package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

@DisplayName("Number of ways to reach the steps")
public class Scenario59Tests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario59Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testSteps_01(){
        Set<Integer> possibleSteps = new HashSet<>();
        possibleSteps.add(1);
        possibleSteps.add(2);
        possibleSteps.add(3);
        possibleSteps.add(5);
        Scenario59.waysToClimb(5,possibleSteps);
        LOGGER.info("{}",  Scenario59.waysToClimb(5,possibleSteps));
    }


    @Test
    @DisplayName("TEST_1")
    public void testSteps_02(){
        Set<Integer> possibleSteps = new HashSet<>();
        possibleSteps.add(1);
        possibleSteps.add(2);
        possibleSteps.add(3);
        possibleSteps.add(5);
        Scenario59.waysToClimb(5,possibleSteps);
        LOGGER.info("{}",  Scenario59.waysToClimb_2(5,possibleSteps));
    }
}
