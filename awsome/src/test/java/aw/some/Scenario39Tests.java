package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@DisplayName("Linked list Palindrome")
public class Scenario39Tests {

    @Test
    @DisplayName("TEST_1")
    public void testIsPalindromeList(){
       Scenario39.Node node_0 = new Scenario39.Node(1);
       Scenario39.Node node_1 = new Scenario39.Node(3);
       Scenario39.Node node_2 = new Scenario39.Node(5);
       Scenario39.Node node_3 = new Scenario39.Node(3);
       Scenario39.Node node_4 = new Scenario39.Node(1);
       Scenario39.LinkedList list = new Scenario39.LinkedList();
       list.head = node_0;
       list.head.next = node_1;
       list.head.next.next = node_2;
       list.head.next.next.next = node_3;
       list.head.next.next.next.next = node_4;

        assertThat(node_0.data, is(equalTo(1)));
        assertThat(list.head.data, is(equalTo(1)));
        assertThat(Scenario39.isPalindromeList(list), is(equalTo(TRUE)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testIsPalindromeList_1(){
        Scenario39.Node node_0 = new Scenario39.Node(1);
        Scenario39.Node node_1 = new Scenario39.Node(3);
        Scenario39.Node node_2 = new Scenario39.Node(5);
        Scenario39.Node node_3 = new Scenario39.Node(3);
        Scenario39.Node node_4 = new Scenario39.Node(5);
        Scenario39.LinkedList list = new Scenario39.LinkedList();
        list.head = node_0;
        list.head.next = node_1;
        list.head.next.next = node_2;
        list.head.next.next.next = node_3;
        list.head.next.next.next.next = node_4;

        assertThat(node_0.data, is(equalTo(1)));
        assertThat(list.head.data, is(equalTo(1)));
        assertThat(Scenario39.isPalindromeList(list), is(equalTo(FALSE)));
    }


    @Test
    @DisplayName("TEST_3")
    public void testIsPalindromeList_2(){
        Scenario39.Node node_0 = new Scenario39.Node(1);
        Scenario39.Node node_1 = new Scenario39.Node(3);
        Scenario39.Node node_2 = new Scenario39.Node(5);
        Scenario39.Node node_3 = new Scenario39.Node(3);
        Scenario39.Node node_4 = new Scenario39.Node(1);
        Scenario39.LinkedList list = new Scenario39.LinkedList();
        list.head = node_0;
        list.head.next = node_1;
        list.head.next.next = node_2;
        list.head.next.next.next = node_3;
        list.head.next.next.next.next = node_4;

        assertThat(node_0.data, is(equalTo(1)));
        assertThat(list.head.data, is(equalTo(1)));
        assertThat(Scenario39.isPalindromeList_1(list), is(equalTo(TRUE)));
    }
}