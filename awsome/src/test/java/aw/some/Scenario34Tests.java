package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Maximum Sub array problem")
public class Scenario34Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario34Tests.class);
    @DisplayName("TEST_1")
    @Test
    public void testMaximumSubArray(){
        int arr[]  = new int[] { 1, 3, 5,12, 13, 15, 16, 19, 7, 9, -12 ,-2,-31 };
        LOG.info("{}",Scenario34.maximumSubArray_1(arr));
        assertThat(Scenario34.maximumSubArray_1(arr),is(equalTo(100)));
    }

    @DisplayName("TEST_2")
    @Test
    public void testMaximumSubArray_2(){
        int arr[]  = new int[] { 1, 3, 5,12, 13, 15, 16, 19, 7, 9, -12 ,-2,-31 };
        LOG.info("{}",Scenario34.maximumSubArray_1(arr));
        assertThat(Scenario34.maximumSumSubArray_2(arr),is(equalTo(100)));
    }

    @DisplayName("TEST_3")
    @Test
    public void testMaximumSubArray_3(){
        int arr[]  = new int[] { 1, 3, 5,12, 13, 15, 16, 19, 7, 9, -12 ,-2,-31 };
        LOG.info("{}",Scenario34.maximumSubArray_1(arr));
        assertThat(Scenario34.maximumSumSubArray_3(arr),is(equalTo(100)));
    }
}
