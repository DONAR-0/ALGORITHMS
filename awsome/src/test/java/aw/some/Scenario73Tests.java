package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scenario73Tests
 */
@DisplayName("Shortest Palindrome")
public class Scenario73Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario73Tests.class);

	@Test
	public void testShortestPalindrome() {
		LOGGER.info("{}",Scenario73.shortestPalindrome_1("bnoanaona"));
	}

	@Test
	public void testShortestPalindrome_2() {
		LOGGER.info("{}",Scenario73.shortestPalindrome_2("bnoanaona"));
	}
	
}
