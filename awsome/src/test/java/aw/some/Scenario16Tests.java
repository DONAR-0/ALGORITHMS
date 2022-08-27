package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario16Tests
*/
@DisplayName("Linked List Name")
public class Scenario16Tests {


	private static Logger LOG = LoggerFactory.getLogger(Scenario16Tests.class);

	@Test
	@DisplayName("scenario16_Test_01")
	public void scenario16_Test_01() {
		//Print value in Node
		Scenario16 scenario16 = new Scenario16();
		Scenario16.ListNode next4 = new Scenario16.ListNode(5);
		Scenario16.ListNode next3 = new Scenario16.ListNode(4,next4);
		Scenario16.ListNode next2 = new Scenario16.ListNode(3,next3);
		Scenario16.ListNode next = new Scenario16.ListNode(2,next2);
		Scenario16.ListNode head = new Scenario16.ListNode(1,next);
		LOG.info("{}",scenario16.printLinkNode(head));	
	}
	
	@Test
	@DisplayName("scenario16_Test_02")
	public void scenario16_Test_02() {
		//Print value in Node
		Scenario16 scenario16 = new Scenario16();
		Scenario16.ListNode next4 = new Scenario16.ListNode(5);
		Scenario16.ListNode next3 = new Scenario16.ListNode(4,next4);
		Scenario16.ListNode next2 = new Scenario16.ListNode(3,next3);
		Scenario16.ListNode next = new Scenario16.ListNode(2,next2);
		Scenario16.ListNode head = new Scenario16.ListNode(1,next);
		LOG.info("{}",scenario16.printLinkNode(head));
		scenario16.removeNodeFromList(head, 2);
		LOG.info("{}",scenario16.printLinkNode(head));

	}


	@Test
	@DisplayName("scenario16_Test_03")
	public void scenario16_Test_03() {
		//Print value in Node
		Scenario16 scenario16 = new Scenario16();
		Scenario16.ListNode next4 = new Scenario16.ListNode(5);
		Scenario16.ListNode next3 = new Scenario16.ListNode(4,next4);
		Scenario16.ListNode next2 = new Scenario16.ListNode(3,next3);
		Scenario16.ListNode next = new Scenario16.ListNode(2,next2);
		Scenario16.ListNode head = new Scenario16.ListNode(1,next);
		LOG.info("{}",scenario16.printLinkNode(head));
		scenario16.removeNthFromEnd(head, 2);
		LOG.info("{}",scenario16.printLinkNode(head));

	}
	
}
