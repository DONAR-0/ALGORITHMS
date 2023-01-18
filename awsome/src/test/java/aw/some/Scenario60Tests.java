package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DisplayName("Number of sub")
public class Scenario60Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario60Tests.class);

	@Test
	@DisplayName("TEST_1")
	public void testNumberOfSubsets(){
		int[] arr = new int[]{12, 13, 21, 25, 26, 9, 6, 11};
		LOGGER.info("{}",Scenario60.subsetThatSumsUptoK(arr, 25));
	}
}
