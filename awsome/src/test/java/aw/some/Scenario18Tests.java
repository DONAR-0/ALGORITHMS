package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario18Tests
*/
@DisplayName("Merged Two Sorted List")
public class Scenario18Tests {

	private static final Logger LOG = LoggerFactory.getLogger(Scenario18Tests.class);

	@Test
	@DisplayName("scenario18_Test_01")
	public void Scenario18_Test_01() {
		Scenario18 scenario18 = new Scenario18();
		Scenario18.ListNode next4 = new Scenario18.ListNode(4);
		Scenario18.ListNode next3 = new Scenario18.ListNode(4,next4);
		Scenario18.ListNode next2 = new Scenario18.ListNode(3,next3);
		Scenario18.ListNode next = new Scenario18.ListNode(2,next2);
		Scenario18.ListNode head = new Scenario18.ListNode(1,next);
		LOG.info("{}",scenario18.printList(head));
	}
}
