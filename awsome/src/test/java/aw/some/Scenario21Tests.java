package aw.some;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
* Scenario21Tests
*/

@DisplayName("A General Date API")
public class Scenario21Tests {


	private static final Logger LOG = LoggerFactory.getLogger(Scenario21Tests.class);
	@Test
	@DisplayName("scenario21_Test_01")
	public void scenario21_Test_01(){
		Scenario21 scenario21 = new Scenario21("12/1/2022");
		LOG.info(scenario21.next().toString());
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() ->  new Scenario21("12/33/4/5"));
		assertTrue(exception.getMessage().toString().contains("Invalid Date"));
	}


	@Test
	@DisplayName("scenario21_Test_02")
	public void scenario21_Test_02(){
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() ->  new Scenario21(33,33,2011));
		assertTrue(exception.getMessage().toString().contains("Invalid Date"));
	}

}
