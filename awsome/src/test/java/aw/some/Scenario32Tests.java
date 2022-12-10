package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Find Duplicates")
public class Scenario32Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario32Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testFindingDuplicates(){
        int[] arr = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45, 13};
        int[] arr_1 = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45};
        LOG.info("{}",Scenario31.removeDuplicates(arr));
       assertThat(Scenario32.findDuplicates(arr),is(equalTo(13)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testFindingDuplicates_2(){
        int[] arr = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45, 13};
        int[] arr_1 = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45};
        LOG.info("{}",Scenario31.removeDuplicates(arr));
        assertThat(Scenario32.findDuplicates_2(arr),is(equalTo(13)));
    }


    @Test
    @DisplayName("TEST_3")
    public void testFindingDuplicates_3(){
        int[] arr = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45, 13};
        int[] arr_1 = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45};
        LOG.info("{}",Scenario31.removeDuplicates(arr));
        assertThat(Scenario32.findDuplicates_3(arr),is(equalTo(13)));
    }
}
