package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario76Tests
*/
@DisplayName("N-Queen Problem")
public class Scenario76Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario76Tests.class);
	@Test
	@DisplayName("TEST_1")
	public void testNQueen(){
		LOGGER.info("{}",Scenario76.nQueens(4));
		
	}
}
