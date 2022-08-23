package aw.some;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Arrays;

/**
* Scenario14Tests
*/
@DisplayName("Avrage of number")
public class Scenario14Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario14Tests.class);

	@Test
	@DisplayName("scenario14_Test_01")
	public void scenario14_Test_01() {
		Scenario14 scenario14 = new Scenario14();
		int[] array = new int[] { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29 };
		Integer[] arrayIntegers= new Integer[] { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29 };
		int actualValue = scenario14.averageValueOfArray(array);
		LOGGER.info("{}",actualValue);
		int expectedValue = 45;
		assertThat(actualValue,is(equalTo(expectedValue)));
		actualValue = scenario14.averageValueOfArray1(arrayIntegers);
		assertThat(actualValue,is(equalTo(expectedValue)));
	}
}
