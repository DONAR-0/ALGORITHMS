package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Peak Finding")
public class Scenario38Tests {

    @Test
    @DisplayName("TEST_1")
    public void testPeakFinding() {
        int[] arr = new int[]{1, 3, 5, 8, 8, 3, 9};
        assertThat(Scenario38.findPeak(arr), is(equalTo(3)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testPeakFinding_1() {
        int[] arr = new int[]{1, 3, 5, 8, 8, 3, 9};
        assertThat(Scenario38.findPeak_1(arr), is(equalTo(3)));
    }


    @Test
    @DisplayName("TEST_3")
    public void testPeakFinding_2() {
        int[] arr = new int[]{1, 3, 5, 8, 8, 3, 9};
        assertThat(Scenario38.findPeak_rec(arr), is(equalTo(3)));
    }
}
