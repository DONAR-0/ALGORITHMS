package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("SinglyLinkedList Test Cases")
public class Scenario02Tests{
	
	@DisplayName("TEST_1:Non Null Check")
	@Test
	public void scenario02_Test_01() {
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(1);
		assertThat("Check if Object is not null",!Objects.isNull(scenario02),is(true));
	}

	@DisplayName("TEST_2:Insertion Test")
	public void scenario02_Test_02() {
		Scenario02 scenario02 = new Scenario02();
		scenario02.insert(5);
		scenario02.insert(2);
		scenario02.insert(3);
		scenario02.insertHead(6);
		assertThat("check the head part is working or not",scenario02.getHeadValue(),is(6));
	}
}
