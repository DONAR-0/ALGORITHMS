package aw.some;

import java.util.StringJoiner;


/**
 * Leet Code 
 * Single Linked List code 
 *
 * */
public class Scenario16 {
	
	public ListNode removeNthFromEnd(ListNode head,int n) {
		ListNode currentNode = head;
		ListNode previousNode = head;
		int size = 0;
		while (currentNode != null) {
			size = size + 1;
			currentNode = currentNode.next;	
		}
		int fromStart = (size - n);
		int counter = 0;
		while (currentNode != null) {
			if (counter < fromStart) {
				counter = counter + 1;
				previousNode = currentNode;
			}
			System.out.println(previousNode.val);
			currentNode = currentNode.next;
		}
		previousNode.next = previousNode.next.next;
		return head;
	}

	public ListNode removeNodeFromList(ListNode head,int n) {
		ListNode currentNode = head;
		ListNode previousNode = head;
		int counter = 0;
		while (currentNode != null) {
			if(counter < n) {
				counter = counter + 1;
				previousNode = currentNode;
			}
			System.out.println(currentNode.val);
			currentNode = currentNode.next;
		}
		previousNode.next = previousNode.next.next;
		return head;

	}

	public String printLinkNode(ListNode head) {
		StringJoiner stringBuilder = new StringJoiner(" -> ");
		ListNode currentNode = head;
		while (currentNode != null) {
			stringBuilder.add(""+currentNode.val);
			currentNode = currentNode.next;
		}
		return stringBuilder.toString();

	}

	static class ListNode{
		int val;
		ListNode next;
		ListNode () {}
		ListNode (int val) { this.val = val;}
		ListNode (int val,ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
