package aw.some;

/**
 * By Dealing with values
 * Time Complexity: O(n2)
 * Space Complexity: O(1)
 */
public class Scenario37 {

    static class Node {
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

    static class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        public LinkedList(Node head) {
         this.head = head;
        }
    }

    public static Node reverseList(LinkedList list) {
        int length = 0;
        Node temp = list.head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        Node left = list.head;
        for (int i = 0; i < length/2; i++){
            Node right = list.head;
            for (int j = 0; j < length-i-1;j++){
                right = right.next;
            }
            int tempData = left.data;
            right.data = tempData;
            left = left.next;
        }
        return left;
    }
}