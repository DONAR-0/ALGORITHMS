package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario75Tests
*/
@DisplayName("Word Search")
public class Scenario75Tests {


	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario75.class);

	@Test
	@DisplayName("TEST_1")
	public void testScenario75(){
			char[][] board = {
				{'k','i','n','t'},
				{'b','i','n','s'},
				{'g','n','y','i'},
				{'u','o','e','d'},
				{'d','i','b','v'},
				{'h','i','r','t'}
			};
			String word = "inside";
			Boolean exist = Scenario75.exist(board, word);
			LOGGER.info("{}",exist);
	}
	

	@Test
	@DisplayName("TEST_2")
	public void testScenario75_2(){
			char[][] board = {
				{'k','i','n','t'},
				{'b','i','n','s'},
				{'g','n','y','i'},
				{'u','o','y','d'},
				{'d','i','b','v'},
				{'h','i','r','t'}
			};
			String word = "inside";
			Boolean exist = Scenario75.exist(board, word);
			LOGGER.info("{}",exist);
	}
}
