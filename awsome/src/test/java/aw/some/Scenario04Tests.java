package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario04Tests
*/
@DisplayName("Reversing a linked list")
public class Scenario04Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario04Tests.class);

	@Test
	@DisplayName("TEST_1: creating a linked list")
	public void scenario04_Test_01() {
		Scenario04.ListNode head = new Scenario04.ListNode(6);
		Scenario04.ListNode first = new Scenario04.ListNode(8);
		Scenario04.ListNode second = new Scenario04.ListNode(9);
		Scenario04.ListNode third = new Scenario04.ListNode(10);
		Scenario04.ListNode fourth = new Scenario04.ListNode(11);

		Scenario04 scenario04 = new Scenario04(head);
		scenario04.add(first);
		scenario04.add(second);
		scenario04.add(third);
		scenario04.add(fourth);
		LOGGER.info("Printing Linked list before reverse");
		scenario04.print();
		scenario04.reverse();
		LOGGER.info("Printing Linked list after reverse");
		scenario04.print();
	}

}
