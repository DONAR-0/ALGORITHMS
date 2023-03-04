package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DisplayName("Edit Distance")
public class Scenario66Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario66Tests.class);
    @Test
    @DisplayName("Edit Distance using recursion")
    public void test_edit_distance(){
        LOGGER.info("{}",Scenario66.minDistance("value","value2"));
    }


    @Test
    @DisplayName("Edit Distance using recursion")
    public void test_edit_distance_2(){
        LOGGER.info("{}",Scenario66.minDistance_2("value","value2"));
    }
}
