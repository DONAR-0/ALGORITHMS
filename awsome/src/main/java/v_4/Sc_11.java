package v_4;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Reverse Linked list Palindrome
 *
 */
public class Sc_11 {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static class LinkedList{
        Node head;
        public LinkedList() {
            this.head = null;
        }
        public LinkedList(Node head) {
            this.head = head;
        }
    }

    public static boolean isPalindrome(LinkedList list) {
        int length = 0;
        Node temp = list.head;
        //
        while (temp != null) {
            length ++;
            temp = temp.next;
        }
        //
        Node left = list.head;
        for (int i = 0; i < length/2;i ++) {
            //
            Node right = list.head;

            for (int j = 0; j < length - i - 1; j++) {
                right = right.next;
            }
            //
            if (right.data != left.data) return false;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Orange");
        Iterator<String> i = list.listIterator();
        i.next();
        i.forEachRemaining(System.out::println);
//        i.next();
        Spliterator<String> s = list.spliterator();
        s.tryAdvance(System.out::println);
        s.forEachRemaining(System.out::println);

        boolean b = s.tryAdvance(System.out::println);
        System.out.println(b);

        Vector v1 = new Vector();
        Vector v2 = new Vector(20);
        v2.add(10);
        v2.add(20);
        v2.add(30);
        Vector v3 = new Vector(30,10);
//        System.out.println(v2.listIterator().next());
        v2.stream().forEach(System.out::println);
        ConcurrentHashMap hashMap = new ConcurrentHashMap<>();
        hashMap.put("java",Integer.valueOf(10));
        hashMap.put("python", Integer.valueOf(18));
        hashMap.put("Scala", Integer.valueOf(10));
        hashMap.put("C++", Integer.valueOf(31));
        hashMap.put("C", Integer.valueOf(41));

        System.out.println(hashMap);
    }
}
