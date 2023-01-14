package aw.some;

/**
 * Scenario58
 * Time Complexity: O(n)
 * Space Complexity: O(max(n,m))
 *
 */
public class Scenario58 {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public static class LinkedList {
    Node head;

    public LinkedList() { this.head = null; }

    public LinkedList(Node head) { this.head = head; }
  }

  public static LinkedList addTwoLinkedList(LinkedList list1,
                                            LinkedList list2) {
    return null;
  }
}
