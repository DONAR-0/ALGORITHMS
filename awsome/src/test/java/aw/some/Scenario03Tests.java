package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Tests for Matrix
 *
 * */
@DisplayName("Matrix Tests Questions")
public class Scenario03Tests {


	@Test
	@DisplayName("TEST_1: find value in matrix happy check")
	public void scenario03_Test_01() {
		Scenario03 scenario03 = new Scenario03();
		int[][] matrix = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11}
		};
		//scenario03.printMatrix(matrix);
		scenario03.printMatrix(matrix, 1, 2);
		//assertThat("happy check",scenario03.findValueInSortedMatrix(matrix,7),is(true));
	}
}
