package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
* Scenario61Tests
*/
@DisplayName("Ways to decode problem")
public class Scenario61Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario61Tests.class);

	@Test
	@DisplayName("TEST_1")
	public void testAStringTheValue(){
	   String value = "22";
	   LOGGER.info("{}",String.valueOf(Scenario61.waysToDecode_1(value)));
	   assertThat(Scenario61.waysToDecode_1("22"), is(equalTo(2)));
	}


	@Test
	@DisplayName("TEST_2")
	public void testAStringTheValue_2(){
		String value = "22";
		LOGGER.info("{}",String.valueOf(Scenario61.waysToDecode_2(value)));
		assertThat(Scenario61.waysToDecode_1("22"), is(equalTo(2)));
	}

}
