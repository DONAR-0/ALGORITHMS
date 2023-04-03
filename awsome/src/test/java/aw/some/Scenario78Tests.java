package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario78Tests
*/
@DisplayName("Longest Increaseing Subsequence")
public class Scenario78Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario78Tests.class);

	@Test
	public void test_1() {
		int[] arr = new int[]{5,3,8,7,4};
		LOGGER.info("{}",Scenario78.lis_1(arr));
	}

	@Test
	public void test_2() {
		int[] arr = new int[]{5,3,8,7,4};
		LOGGER.info("{}",Scenario78.lis_2(arr));
	}

	@Test
	public void test_3() {
		int[] arr = new int[]{5,3,8,7,4};
		LOGGER.info("{}",Scenario78.list_3(arr));
	}

}
