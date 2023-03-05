package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario67Tests
*/

@DisplayName("lcs value")
public class Scenario67Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario67Tests.class);
	@Test
	@DisplayName("Test lcs 1")
	public void test_lcs(){
		LOGGER.info("{}",Scenario67.lcs_1("IamHere","IamHere"));
	}
	
	@Test
	@DisplayName("Test lcs 2")
	public void test_lcs_2(){
		LOGGER.info("{}",Scenario67.lcs_2("helloIamHere","IamHere"));
	}


	@Test
	@DisplayName("Test lcs 3")
	public void test_lcs_3(){
		LOGGER.info("{}",Scenario67.lcs_2("helloIamHere","IamHere"));
	}
}
