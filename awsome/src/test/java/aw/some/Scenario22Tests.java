package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
* Scenario22Tests
*/
@DisplayName("Array Test Case")
public class Scenario22Tests {

	private static final Logger LOG = LoggerFactory.getLogger(Scenario22Tests.class);
	
	@Test
	@DisplayName("scenario22_Test_01")
	public void scenario22_Test_01(){
		Scenario22 scenario22 = new Scenario22(10);
		LOG.info(scenario22.print());
		int value = 12;
		assertThat(scenario22.insert(value, 3),is(equalTo(value)));
		LOG.info(scenario22.print());
	}
}
