package v_4;

/**
 * Sort Linked list
 */
public class Sc_15 {

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

        public LinkedList() {
            this.head = null;
        }

        public LinkedList(Node head) {
            this.head = head;
        }
    }

    /**
     * Time Complexity: O(n2)
     * SP: O(n)
     * @param list
     */
    public static void sortList(LinkedList list) {
        Node i = list.head;
        while (i != null) {
            Node j = list.head;
            while (j.next != null) {
                if (j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }

    public static Node mergeSort(Node head) {
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node headRightHalf = slow.next;
        slow.next = null;
        headRightHalf = mergeSort(headRightHalf);
        return mergeSortLists(head,headRightHalf);
    }

    private static Node mergeSortLists(Node head1,Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node retunrnHead = null;
        Node tail = null;
        Node lower;
        while (ptr1 != null || ptr2 != null) {
            if (ptr1 != null && ptr2 != null) {
                if (ptr1.data < ptr2.data) {
                    lower = ptr1;
                    ptr1 = ptr1.next;
                } else {
                    lower = ptr2;
                    ptr2 = ptr2.next;
                }
            } else if (ptr1 != null) {
                lower = ptr1;
                ptr1 = ptr1.next;
            } else {
                lower = ptr2;
                ptr2 = ptr2.next;
            }
            if (retunrnHead == null) {
                retunrnHead = lower;
                tail = lower;
            } else {
                tail.next = lower;
                tail = tail.next;
            }
        }
        return retunrnHead;
    }

    /**
     * Time Complexity: o(nlogn)
     * Space Complexity: o(logn)
     * @param list
     */
    public static void sortList_2(LinkedList list) {
        list.head = mergeSort(list.head);
    }
}
