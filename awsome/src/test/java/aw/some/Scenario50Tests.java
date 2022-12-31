package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Values in checking")
public class Scenario50Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario50Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testCanJumpScenario(){
        int[] arr = new int[] {3,0,2,0,4,0,0,6,7,0,0,0,0,5};
        LOG.info("{}",Scenario50.canJump(arr));
        assertThat(Scenario50.canJump(arr),is(equalTo(Boolean.TRUE)));
    }



    @Test
    @DisplayName("TEST_2")
    public void testCanJumpScenario_2(){
        int[] arr = new int[] {3,0,2,0,4,0,0,6,7,0,0,0,0,5};
        LOG.info("{}",Scenario50.canJump_2(arr));
        assertThat(Scenario50.canJump_2(arr),is(equalTo(Boolean.TRUE)));
    }


    @Test
    @DisplayName("TEST_3")
    public void testCanJumpScenario_3(){
        int[] arr = new int[] {3,0,2,0,4,0,0,6,7,0,0,0,0,5};
        LOG.info("{}",Scenario50.canJump_3(arr));
        assertThat(Scenario50.canJump_3(arr),is(equalTo(Boolean.TRUE)));
    }
}
