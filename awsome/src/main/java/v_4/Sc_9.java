package v_4;

import aw.some.Scenario43;

/**
 * Reversing a linked
 * list
 */
public class Sc_9 {

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
        Node tail;
        int length;

        public LinkedList() {
            this.head = null;
        }

        public LinkedList(int value) {
            this(new Node(value));
        }

        public LinkedList(Node head) {
            this.head = head;
        }


        public void append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }

        public Node removeLast() {
            if (length == 0) {
                return null;
            }
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public static void printList(LinkedList list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.printf("%s ==> ", temp.data);
            temp = temp.next;
        }
    }

    /**
     * Value Swapping technique
     * Space Complexity: O(1)
     * Time Complexity: O(n + n/2) ~ O(n2)
     *
     * @param list
     * @return
     */
    public static Node rev(LinkedList list) {
        int length = 0;
        Node temp = list.head;
        while (temp != null) {
            length ++;
            temp = temp.next;
        }
        Node left = list.head;
        for (int i = 0; i < length /2 ;i++) {
            Node right = list.head;
            for (int j = 0; j < length - i - 1; j++) {
                right = right.next;
            }
            //swap //replace//
            int tempData = left.data;
            left.data = right.data;
            right.data = tempData;
            left = left.next;
        }
        return left;
    }


    /**
     * Reverse by link
     * TC: O(n)
     * SC: O(1)
     *
     * @param list
     * @return
     */
    public static void reverseList_by_links(LinkedList list) {
        Node previous = null;
        Node current = list.head;
        while (current != null) {
            Node next = current.next;
            current.next = previous; // first value is null than next loop will be previous value
            previous = current; // this is point changer
            current = next; // pointer
        }
        list.head = previous;
//        return list.head;
    }

    /**
     * By Delaing wiht links recursively
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param node
     * @return
     */
    public static Node reverseNodes(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node reversed = reverseNodes(node.next);
        node.next.next =node;
        node.next = null;
        return reversed;
    }

    public static void reverseNodes(LinkedList list){
        list.head = reverseNodes(list.head);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);

//        Sc_9.printList(list);
//        Sc_9.rev(list);
//        System.out.println();
//        Sc_9.printList(list);


//        Sc_9.printList(list);
//        Sc_9.reverseList_by_links(list);
//        System.out.println();
//        Sc_9.printList(list);

        Sc_9.printList(list);
        Sc_9.reverseNodes(list);
        System.out.println();
        Sc_9.printList(list);

//        int[] z = {1,2,3,4,5,6};
//
//        int[] [] b = new int[3][];
//        b[0] = new int[]{5,6};
//        System.out.println(b[0][0]);
    }
}
