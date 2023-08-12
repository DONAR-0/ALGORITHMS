package aw.some;

/**
 * Sort Linked List
 */
public class Scenario43 {

    /************************************************************************************/
    /**                            Bubble sort Linked list                             **/
    /************************************************************************************/
    /**
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     */
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static class LinkedList {
        Node head;

        public LinkedList(){
            this.head = null;
        }

        public LinkedList(Node head) {
            this.head = head;
        }
    }

    public static void sortList(LinkedList lis) {
        Node i = lis.head;
        while (i != null){
            Node j = lis.head;
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


    /************************************************************************************/
    /**                            Merge sort Linked list                             **/
    /************************************************************************************/

    public static Node mergeSort(Node head){
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node headRightHalf = slow.next;
        slow.next = null;
        headRightHalf = mergeSort(headRightHalf);
        return mergeSortLists(head,headRightHalf);
    }

    private static Node mergeSortLists(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node returnedHead = null;
        Node tail = null;
        Node lower;
        while (ptr1 != null || ptr2 != null){
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
            if (returnedHead == null){
                returnedHead = lower;
                tail =lower;
            } else {
                tail.next = lower;
                tail = tail.next;
            }
        }
        return returnedHead;
    }

    public static void sortList_2(LinkedList list) {
        list.head = mergeSort(list.head);
    }
}
