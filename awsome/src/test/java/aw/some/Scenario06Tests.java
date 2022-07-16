package aw.some;


import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsMapContaining.hasEntry;

import org.hamcrest.core.AllOf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;

/**
* Scenario06Tests
*/
public class Scenario06Tests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario06Tests.class);
	

	@Test
	@DisplayName("TEST_1:Max and main value")
	public void scenario06_Test_01() {
		Scenario06 scenario06 = new Scenario06();
		int[][] matrix = {
			{0,1,2,3,5,5,5,6,6,1,5,4,1,8,9,4,5,8,4,6,1,8,4,1,8,4,8,4,8},
			{9,10,11,12,54,81,57,38,79,93,20,54,80,48,04,48,44,04,44,48},
		};
		LOGGER.info("Remove Duplicates from array");
		LOGGER.info("{}",matrix[0]);
		scenario06.largestAndSmallest(matrix[0]);
		LOGGER.info("{}",matrix[1]);
		scenario06.largestAndSmallest(matrix[1]);

	}

	@Test
	@DisplayName("TEST_2:Print Pairs from array")
	public void scenario06_Test_02() {
		Scenario06 scenario06 = new Scenario06();
		int[][] matrix = {
			{2,4,3,5,7,8,9},
			{2,4,3,5,6,-2,4,7,8,9},
		};
		HashMap<Integer,Integer> pairMap = new HashMap<>();
		LOGGER.info("Find Sum Pairs");
		LOGGER.info("{}",matrix[0]);
		pairMap = scenario06.printPairs(matrix[0],7);
		LOGGER.info("{}",matrix[1]);
		scenario06.printPairs(matrix[1],7);
		assertThat("Happy Check",pairMap,hasEntry(4,3));
	}

	@Test
	@DisplayName("TEST_3:Print Pairs using Set")
	public void scenario06_Test_03() {
		Scenario06 scenario06 = new Scenario06();
		int[][] matrix = {
			{2,4,3,5,7,8,9},
			{2,4,3,5,6,-2,4,7,8,9},
		};
		LOGGER.info("Find Sum pairs");
		//LOGGER.info("{}",matrix[0]);
		//scenario06.printPairsUsingSet(matrix[0],7);
		LOGGER.info("{}",matrix[1]);
		scenario06.printPairsUsingSet(matrix[1],7);

	}


	@Test
	@DisplayName("TEST_4:Print Pairs using Set")
	public void scenario06_Test_04() {
		Scenario06 scenario06 = new Scenario06();
		int[][] matrix = {
			{2,4,3,5,7,8,9},
			{2,4,3,5,6,-2,4,7,8,9},
		};
		LOGGER.info("Find Sum pairs");
		LOGGER.info("{}",matrix[0]);
		scenario06.printPairsLoSpaceComplexity(matrix[0],7);
		LOGGER.info("{}",matrix[1]);
		scenario06.printPairsLoSpaceComplexity(matrix[1],7);

	}
	
}

