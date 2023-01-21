package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("Array Permutation")
public class Scenario63Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario63Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testArrayPermutation() {
//        ArrayList arrayList = new ArrayList<>(Arrays.asList(12,13,15,16,17,20,23,25,27,31,33,37,39));
        ArrayList arrayList = new ArrayList<>(Arrays.asList(12,13,15));
        Scenario63.getPermutation_1(arrayList);
        LOGGER.info("{}",Scenario63.getPermutation_1(arrayList));
    }


    @Test
    @DisplayName("TEST_2")
    public void testArrayPermutation_2() {
//        ArrayList arrayList = new ArrayList<>(Arrays.asList(12,13,15,16,17,20,23,25,27,31,33,37,39));
        ArrayList arrayList = new ArrayList<>(Arrays.asList(12,13,15));
        Scenario63.getPermutation_2(arrayList);
        LOGGER.info("{}",Scenario63.getPermutation_2(arrayList));
    }
}
