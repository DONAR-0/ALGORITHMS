package aw.some;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.IsEqual;
/**
* Scenario07Tests
*/
public class Scenario07Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario07Tests.class);


	@Test
	@DisplayName("TEST_1:Quick Sort")
	public void scenario07_Test_01() {
		Scenario07 scenario07 = new Scenario07();
		int[][] matrix = {
			{0,1,2,3,5,5,5,6,6,1,5,4,1,8,9,4,5,8,4,6,1,8,4,1,8,4,8,4,8},
			{9,10,11,12,54,81,57,38,79,93,20,54,80,48,04,48,44,04,44,48},
		};
		LOGGER.info("Quick Sort Algo");
		LOGGER.info("{}",matrix[1]);
		scenario07.sort(matrix[1]);
		LOGGER.info("{}",matrix[1]);
		int[] sortedValue= {
0, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 8, 8, 8, 8, 8, 8, 9

		};
		assertThat("Sorted Array",scenario07.sort(matrix[0])
		,is(equalTo(sortedValue)));
	}


}
