package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Remove Duplicates from arr")
public class Scenario31Tests {

    private static Logger LOG = LoggerFactory.getLogger(Scenario31Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testRemoveDuplicates() {
        int[] arr = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45, 13};
        int[] arr_1 = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45};
        Scenario31.removeDuplicates(arr);
        assertThat(Arrays.asList(Scenario31.removeDuplicates(arr)), containsInAnyOrder(Arrays.asList(arr_1)));
    }
    
    @Test
    @DisplayName("TEST_1")
    public void testRemoveDuplicates_2() {
        int[] arr = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45, 13};
        int[] arr_1 = new int[]{21, 22, 13, 17, 32, 36, 90, 67, 45};
        Scenario31.removeDuplicates(arr);
        assertThat(Arrays.asList(Scenario31.removeDuplicates_2(arr)), containsInAnyOrder(Arrays.asList(arr_1)));
    }
}
