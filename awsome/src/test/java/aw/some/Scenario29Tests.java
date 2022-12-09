package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Find pair that sums up to k")
public class Scenario29Tests {

    @DisplayName("TEST_1")
    @Test
    public void testPair1() {
        int[] arr = new int[]{12, 13, 21, 25, 26, 9, 6, 11};
        int val = 25;
        System.out.println(Scenario29.findPair(arr, val));
    }
    @DisplayName("TEST_2")
    @Test
    public void testPair2() {
        int[] arr = new int[]{12, 13, 21, 25, 26, 9, 6, 11};
        int val = 25;
        System.out.println(Scenario29.findPair2(arr, val));
    }
    @DisplayName("TEST_3")
    @Test
    public void testPair3() {
        int[] arr = new int[]{12, 13, 21, 25, 26, 9, 6, 11};
        int val = 25;
        System.out.println(Scenario29.findPair3(arr, val));
    }


}
