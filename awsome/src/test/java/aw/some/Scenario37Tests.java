package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Reversing the linked list")
public class Scenario37Tests {

    @Test
    @DisplayName("TEST_1:Test if linked list is working")
    public void testIfLinkedList() {
        Scenario37.Node node = new Scenario37.Node(1);
        Scenario37.LinkedList list = new Scenario37.LinkedList();
        list.head = node;
        list.head.next = new Scenario37.Node(3);
        list.head.next.next = new Scenario37.Node(5);
        list.head.next.next.next = new Scenario37.Node(5);
        assertThat(node.data, is(equalTo(1)));
        assertThat(list.head.data, is(equalTo(1)));
        assertThat(Scenario37.reverseList(list).data, is(equalTo(3)));
    }

}