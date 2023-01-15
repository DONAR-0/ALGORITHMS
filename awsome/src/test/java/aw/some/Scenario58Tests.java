package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
/**
 * Scenario58Tests
 */
@DisplayName("Add two Linked list")
public class Scenario58Tests {


	@Test
	@DisplayName("TEST_1")
	public void testAddedLinkedList(){

		Scenario58.Node node_0 = new Scenario58.Node(1);
		Scenario58.Node node_1 = new Scenario58.Node(3);
		Scenario58.Node node_2 = new Scenario58.Node(5);
		Scenario58.Node node_3 = new Scenario58.Node(3);
		Scenario58.Node node_4 = new Scenario58.Node(1);
		
		Scenario58.Node node_5 = new Scenario58.Node(1);
		Scenario58.Node node_6 = new Scenario58.Node(3);
		Scenario58.Node node_7 = new Scenario58.Node(5);
		Scenario58.Node node_8 = new Scenario58.Node(3);
		Scenario58.Node node_9 = new Scenario58.Node(1);
		
		Scenario58.LinkedList list_1 = new Scenario58.LinkedList();
		list_1.head = node_0;
		list_1.head.next = node_1;
		list_1.head.next.next = node_2;
		list_1.head.next.next.next = node_3;
		list_1.head.next.next.next.next = node_4;


		Scenario58.LinkedList list_2 = new Scenario58.LinkedList();
		list_2.head = node_5;
		list_2.head.next = node_6;
		list_2.head.next.next = node_7;
		list_2.head.next.next.next = node_8;
		list_2.head.next.next.next.next = node_9;

		assertThat(node_0.data, is(equalTo(1)));
		assertThat(Scenario58.addTwoLinkedList(list_1, list_2).head.data, is(equalTo(2)));
		//assertThat(, is(equalTo(TRUE)));

	}
}
