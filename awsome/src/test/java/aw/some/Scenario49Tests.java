package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Product except itself")
public class Scenario49Tests {


    @DisplayName("TEST_1")
    @Test
    public void testProductExcept_itself() {
        int[] arr = new int[]{2, 3, 4, 5};
        int[] output = new int[]{60, 40, 30, 24};
        assertThat(Scenario49.productExceptSelf(arr),is(equalTo(output)));
    }



    @DisplayName("TEST_2")
    @Test
    public void testProductExcept_itself_2() {
        int[] arr = new int[]{2, 3, 4, 5};
        int[] output = new int[]{60, 40, 30, 24};
        assertThat(Scenario49.productExceptSelf_2(arr),is(equalTo(output)));
    }
}