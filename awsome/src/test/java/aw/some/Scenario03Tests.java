package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Tests for Matrix
 *
 * */
@DisplayName("Matrix Tests Questions")
public class Scenario03Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario03Tests.class);

	@Test
	@DisplayName("TEST_1: find value in matrix happy check")
	public void scenario03_Test_01() {
		Scenario03 scenario03 = new Scenario03();
		int[][] matrix = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11}
		};
		LOGGER.info("Printing a matrix");
		scenario03.printMatrix(matrix);
		LOGGER.info("Printing a matrix from certain points");
		scenario03.printMatrix(matrix, 1, 2);
		assertThat("happy check",scenario03.findValueInSortedMatrix(matrix,7),is(true));
	}

	@Test
	@DisplayName("TEST_2: find value in one loop")
	public void scenario03_Test_02() {
		Scenario03 scenario03 = new Scenario03();
		int[][] matrix = {
			{0,1,2,3},
			{4,5,6,7},
			{8,9,10,11},
			{12,13,14,15}
		};
		LOGGER.info("Only One While loop");
		assertThat("happy check for n log n", scenario03.findValueInSortedMatrixinOneLoop(matrix,4,10),is(true));
	}

	@Test
	@DisplayName("TEST_3: Different values in every row")
	public void scenario03_Test_03() {
		Scenario03 scenario03 = new Scenario03();
		int[][] matrix = {
			{0,1,2,3},
			{9,10,11,12},
			{21,22,23,25},
			{27,30,31,32}
		};
		LOGGER.info("Only One While loop with Different values in every row");
		assertThat("happy check for log n", scenario03.findValueInSortedMatrixinOneLoop(matrix, 4, 25),is(true));
	}
}
