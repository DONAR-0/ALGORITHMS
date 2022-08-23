package aw.some;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario15Tests
*/
@DisplayName("Shuffle of array values")
public class Scenario15Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario15Tests.class);

	@Test
	@DisplayName("scenario15_Test_01")
	public void scenario15_Test_01() {
		Scenario15 scenario15 = new Scenario15();
		int[] array = new int[] { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29 };
		scenario15.shuffle(array);
		LOGGER.info("{}",array);
		scenario15.shuffle(array);
		LOGGER.info("{}",array);
	}
}
