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

    /**
     * By Dealing with links
     *  Time Complexity: O(n)
     *  Space Complexity: O(1)
     * @param list
     */
    static Node reverseList_ByLinks(LinkedList list){
        Node previous = null;
        Node current = list.head;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        list.head = previous;
        return list.head;
    }

    /**
     * By Dealing with links recursively
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param node
     * @return
     */
    static Node reverseNodes(Node node){
        if (node == null || node.next == null){
            return node;
        }
        Node reversed = reverseNodes(node.next);
        node.next.next = node;
        node.next = null;
        return reversed;
    }

    private static Node reverseList_rec(LinkedList list) {
        list.head = reverseNodes(list.head);
        return list.head;
    }
}