package aw.some;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario74Tests
*/
@DisplayName("Coin Change Problem")
public class Scenario74Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario74Tests.class);

	@Test
	@DisplayName("TEST_1")
	public void testMinCoinChange_1() {
		Set<Integer> coins = new HashSet<>();
		coins.add(1);
		coins.add(2);
		coins.add(3);
		coins.add(5);
		//coins.add(10);

		LOGGER.info("{}",Scenario74.coinChange(0, coins));
		LOGGER.info("{}",Scenario74.coinChange(10, coins));

	}

	@Test
	@DisplayName("TEST_2")
	public void testMinCoinChange_2() {
		Set<Integer> coins = new HashSet<>();
		coins.add(1);
		coins.add(2);
		coins.add(3);
		coins.add(5);
		//coins.add(10);

		LOGGER.info("{}",Scenario74.coinChange_2(0, coins));
		LOGGER.info("{}",Scenario74.coinChange_2(10, coins));

	}

}
