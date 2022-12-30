package aw.some;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
@DisplayName("Minimum Cost path solution")
public class Scenario45Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario45Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testCostPathProblem(){

        int[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        LOG.info("{}",Scenario45.minimumCostPath(matrix));
        assertThat(Scenario45.minimumCostPath(matrix),is(equalTo(24)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testCostPathProblem_2(){

        int[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        LOG.info("{}",Scenario45.minimumCostPath(matrix));
        assertThat(Scenario45.minimumCostPath(matrix),is(equalTo(24)));
    }
}
