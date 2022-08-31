package aw.some;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
* Scenario19Tests
*/
@DisplayName("Fundamental binary search")
public class Scenario19Tests {

	@Test
	@DisplayName("scenario19_Test_01")
	public void scenario19_Test_01() {
		int[] array = new int[] { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29 };
		Arrays.sort(array);

		Scenario19 scenario19 = new Scenario19(array);
		int value = 33;
		int actualValue = scenario19.rank(value);
		int expectedValue = 7;
		assertThat(actualValue,is(equalTo(expectedValue)));
	}
}
