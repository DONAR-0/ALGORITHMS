package aw.some;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
* Scenario17Tests
*/
@DisplayName("Valid Parantheses")
public class Scenario17Tests {

	private static final Logger LOG = LoggerFactory.getLogger(Scenario17Tests.class);

	@Test
	@DisplayName("scenario17_Test_01")
	public void scenario17_Test_01() {
		Scenario17 scenario17 = new Scenario17();
		LOG.info("Scenario17 Values");
		String inputValue = "()[";
		scenario17.isValid(inputValue);
		assertThat(scenario17.isValid(inputValue),is(equalTo(false)));
	}


	@Test
	@DisplayName("scenario17_Test_02")
	public void scenario17_Test_02() {
		Scenario17 scenario17 = new Scenario17();
		LOG.info("Scenario17 Values");
		String inputValue = "()[]";
		scenario17.isValid(inputValue);
		assertThat(scenario17.isValid(inputValue),is(equalTo(true)));
	}

	@Test
	@DisplayName("scenario17_Test_03")
	public void scenario17_Test_03() {
		Scenario17 scenario17 = new Scenario17();
		LOG.info("Scenario17 Values");
		String inputValue = "({})[]";

		//scenario17.isValid(inputValue);
		assertThat(scenario17.isValidOne(inputValue),is(equalTo(true)));
	}

}
