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
		currentNode = head;
		int fromStart = (size - n);
		int counter = 0;
		if (fromStart < 0) {
			throw new IllegalArgumentException("size should be less than value");
		}
		if (fromStart == 0) {
			head = head.next;
		} else {
			while (currentNode != null) {
				if (counter < fromStart) {
					counter = counter + 1;
					previousNode = currentNode;
				}
				currentNode = currentNode.next;
			}
			previousNode.next = previousNode.next.next;
		}
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

	public ListNode removeNthFromEndOne(ListNode head,int n){
		ListNode currentNode = head;
		ListNode firstNode = currentNode.next;
		while ( n-- > 0) {
			firstNode = firstNode.next;
		}
		ListNode secondNode = currentNode;

		while (firstNode != null) {
			secondNode = secondNode.next;
			firstNode = firstNode.next;
		}

		secondNode.next = secondNode.next.next;
		return currentNode.next;
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
