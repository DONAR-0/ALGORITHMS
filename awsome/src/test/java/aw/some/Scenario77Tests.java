package aw.some;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scenario77Tests
 */
@DisplayName("Word Ladder")
public class Scenario77Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario77Tests.class);

	@Test
	@DisplayName("TEST_1")
	public void testWordLadder1() {
		LOGGER.info("{}",Scenario77.transformationSequenceLength("hit","cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"))));
	}

	@Test
	@DisplayName("TEST_2")
	public void testWordLadder2() {
		LOGGER.info("{}",Scenario77.transformationSequenceLength("hit","cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"))));
	}

}
