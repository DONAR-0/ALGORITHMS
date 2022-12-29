package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Bubble sort in linked list")
public class Scenario43Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario43Tests.class);

    @Test
    @DisplayName("TEST_1")
    public void testLinkedList() {
        Scenario43.Node head = new Scenario43.Node(12);
        head.next = new Scenario43.Node(10);
        head.next.next = new Scenario43.Node(15);
        head.next.next.next = new Scenario43.Node(8);
        head.next.next.next.next = new Scenario43.Node(16);
        head.next.next.next.next.next = new Scenario43.Node(16);
        Scenario43.LinkedList list = new Scenario43.LinkedList(head);
        LOG.info("{}", list.head.data);
        assertThat(list.head.data,is(equalTo(12)));
        Scenario43.sortList(list);
        LOG.info("{}", list.head.data);
        assertThat(list.head.data,is(equalTo(8)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testLinkedList_2() {
        Scenario43.Node head = new Scenario43.Node(12);
        head.next = new Scenario43.Node(10);
        head.next.next = new Scenario43.Node(15);
        head.next.next.next = new Scenario43.Node(8);
        head.next.next.next.next = new Scenario43.Node(16);
        head.next.next.next.next.next = new Scenario43.Node(16);
        Scenario43.LinkedList list = new Scenario43.LinkedList(head);
        LOG.info("{}", list.head.data);
        assertThat(list.head.data,is(equalTo(12)));
        Scenario43.sortList_2(list);
        LOG.info("{}", list.head.data);
        assertThat(list.head.data,is(equalTo(8)));
    }
}
