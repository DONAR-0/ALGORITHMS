package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.hamcrest.Matchers.is;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


/**
* Scenario08Tests
*/
public class Scenario08Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario08Tests.class);

	@Test
	@DisplayName("TEST_1:Quick Sort")
	public void scenario08_Test_01() {
		Scenario08 scenario08 = new Scenario08();
		int[][] matrix = {
			{0,1,2,3,5,5,5,6,6,1,5,4,1,8,9,4,5,8,4,6,1,8,4,1,8,4,8,4,8},
			{9,10,11,12,54,81,57,38,79,93,20,54,80,48,04,48,44,04,44,48},
		};
		LOGGER.info("Quick Sort Algo");
		LOGGER.info("{}",matrix[1]);
		List<Integer> list= scenario08.findMissingNumber(matrix[0]);
		LOGGER.info("{}",list);
		int[] sortedValue= {
0, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 8, 8, 8, 8, 8, 8, 9

		};
		//assertThat("Sorted Array",scenario07.sort(matrix[0])
		//,is(equalTo(sortedValue)));
	}

	@Test
	@DisplayName("TEST_2:")
	public void scenario08_Test_02() {

		int[][] matrix = {
			{0,1,2,3,5,5,5,6,6,1,5,4,1,8,9,4,5,8,4,6,1,8,4,1,8,4,8,4,8},
			{9,10,11,12,54,81,57,38,79,93,20,54,80,48,04,48,44,04,44,48},
		};
		LOGGER.info("{}",matrix[0]);
		Scenario08 scenario08 = new Scenario08();
		scenario08.reverseArray(matrix[0]);
		LOGGER.info("{}",matrix[0]);
	}
}
