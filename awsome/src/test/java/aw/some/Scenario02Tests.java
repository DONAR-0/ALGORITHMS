package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("SinglyLinkedList Test Cases")
public class Scenario02Tests{

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario02Tests.class);

	@DisplayName("TEST_1:Non Null Check")
	@Test
	public void scenario02_Test_01() {
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(1);
		LOGGER.info("Check if Object is not null");
		assertThat("Check if Object is not null",!Objects.isNull(scenario02),is(true));
	}

	@Test
	@DisplayName("TEST_2:Insertion Test")
	public void scenario02_Test_02() {
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(5);
		scenario02.insert(2);
		scenario02.insert(3);
		scenario02.insertHead(6);
		LOGGER.info("check the head part is working or not");
		assertThat("check the head part is working or not",scenario02.getHeadValue(),is(6));
	}

	@Test
	@DisplayName("TEST_3: Insertion and remove test")
	public void scenario02_Test_03() {
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(5);
//		scenario02.insertHead(6);
		scenario02.insert(7);
//		scenario02.deleteHead();
		scenario02.getHead();
		LOGGER.info("Remove and check");
		assertThat("Remove and check", scenario02.getHeadValue(),is(5));
	}

	@Test
	@DisplayName("Get Head Value")
	public void scenario02_Test_04(){
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(1);
		scenario02.insert(2);
		scenario02.insert(3);
		scenario02.insert(4);
		LOGGER.info("Head Check");
		scenario02.print(scenario02.getHead());
	}
}
