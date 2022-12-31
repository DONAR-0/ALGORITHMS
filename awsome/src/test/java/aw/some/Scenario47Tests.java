package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
@DisplayName("Paths in matrix")
public class Scenario47Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario47Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testPathMatrix(){

        int[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        LOG.info("{}",Scenario47.paths(matrix));
        assertThat(Scenario47.paths(matrix),is(equalTo(Scenario47.paths(matrix))));
    }


    @Test
    @DisplayName("TEST_2")
    public void testPathMatrix_2(){

        int[][] matrix = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        LOG.info("{}",Scenario47.paths(matrix));
        assertThat(Scenario47.paths(matrix),is(equalTo(Scenario47.paths(matrix))));
    }
}
