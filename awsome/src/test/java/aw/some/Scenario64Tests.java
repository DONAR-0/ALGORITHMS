package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@DisplayName("Longest common subsequences")
public class Scenario64Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario64Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testScenarioLogestCommonSubsequences(){
       LOGGER.info("{}",Scenario64.lcs_1("longcommonsub","common"));
    }


    @Test
    @DisplayName("TEST_2")
    public void testScenarioLogestCommonSubsequences_2(){
        LOGGER.info("{}",Scenario64.lcs_2("longcommonsub","common"));
    }


    @Test
    @DisplayName("TEST_3")
    public void testScenarioLogestCommonSubsequences_3(){
        LOGGER.info("{}",Scenario64.lcs_3("longcommonsub","common"));
    }

    @Test
    @DisplayName("TEST_4")
    public void testScenarioLogestCommonSubsequences_4(){
        LOGGER.info("{}",Scenario64.lcs_4("longcommonsub","common"));
    }


    @Test
    @DisplayName("TEST_5")
    public void testScenarioLogestCommonSubsequences_5(){
        LOGGER.info("{}",Scenario64.lcs_5("longcommonsub","common"));
    }

}
