package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Arrays;


/**
*
 */
@DisplayName("Binary search of numbers")
public class Scenario13Tests {

    @Test
    @DisplayName("scenario13_Test_01")
    public void scenario13_Test_01() {
        Scenario13 scenario13 = new Scenario13();
        int[] array = new int[] {1,2,3,4,5,6};	
	int value = 3;
	int actualValue = scenario13.indexOf(array,value);
	int expectedValue = 2;
	assertThat(actualValue,is(equalTo(expectedValue)));
    }

    @Test
    @DisplayName("scenario13_Test_02")
    public void scenario13_Test_02() {
        Scenario13 scenario13 = new Scenario13();
        int[] array = new int[] { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29 };

	Arrays.sort(array);

	int value = 33;
	int actualValue = scenario13.indexOf(array,value);
	int expectedValue = 7;
	assertThat(actualValue,is(equalTo(expectedValue)));
    }

}
