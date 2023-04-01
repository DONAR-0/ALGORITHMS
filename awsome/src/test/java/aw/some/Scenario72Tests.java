package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class Scenario72Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario72Tests.class);

    @Test
    @DisplayName("Test knap sack Approach 1")
    public void testKnapSack(){
        int[] values = new int[] {10,20,30,40};
        int[] weights = new int[] {30,10,40,20};
        LOGGER.info("{}",Scenario72.knapsack_1(values,weights,40));;
    }
    @Test
    @DisplayName("Test knap sack Approach 2")
    public void testKnapSack_2(){
        int[] values = new int[] {10,20,30,40};
        int[] weights = new int[] {30,10,40,20};
        LOGGER.info("{}",Scenario72.knapsack_2(values,weights,40));;
    }

}
