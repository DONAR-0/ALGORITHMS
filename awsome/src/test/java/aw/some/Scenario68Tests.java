package aw.some;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario68Tests
*/
public class Scenario68Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario68Tests.class);

	@Test
	public void testSmallestAfterRemoving(){
		LOGGER.info("{}",Scenario68.smallestAfterRemoving("12345", 2));
	}
}
