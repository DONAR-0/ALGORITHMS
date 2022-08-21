package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
*
 */
@DisplayName("Back track all the combinations")
public class Scenario13Tests {

    @Test
    @DisplayName("scenario13_Test_01")
    public void scenario13_Test_01() {
        Scenario13 scenario13 = new Scenario13();
        Integer[] array = new Integer[] {1,2,3,4,5,6};
        List<ArrayList<Integer>> combinations = scenario13.combinations(array, 3);
        System.out.println(combinations);
    }
}