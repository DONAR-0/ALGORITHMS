package aw.some;

import java.util.List;
import java.util.PriorityQueue;
import java.util.StringJoiner;


/**
* Scenario18
*/
public class Scenario18 {

	/**
	* Merge Two Sorted list
	*
	* */
	public ListNode mergeTwoList(ListNode listNode1,ListNode listNode2) {
		if(listNode1 == null) {
			return listNode2;
		} 
		if(listNode2 == null) {
			return listNode1;
		}
		ListNode newList = null;
		while(listNode1 != null && listNode2 != null) {
			if(listNode1.val > listNode2.val) {
				newList = addLast(newList,listNode2.val);
				listNode2 = listNode2.next;
			} else {
				newList = addLast(newList,listNode1.val);
				listNode1 = listNode1.next;
			}	
		}
		while(listNode1 != null) {
			newList = addLast(newList,listNode1.val);
			listNode1 = listNode1.next;
		}
		while(listNode2 != null) {
			newList = addLast(newList,listNode2.val);
			listNode2 = listNode2.next;
		}
		return newList;
	}

	/**
	* Add last
	* */
	public ListNode addLast(ListNode head,int val){
		ListNode current = head;
		ListNode newNode = new ListNode(val);
		if(current == null) {
			head = newNode;
			return head;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return newNode;
	}

	/**
	* print Linked list 
	* @param head
	*
	* */
	public String printList(ListNode head){
		ListNode currentNode = head;
		StringJoiner stringJoiner = new StringJoiner(" -> ");
		while (currentNode != null) {
			stringJoiner.add(""+currentNode.val);
			currentNode = currentNode.next;
		}
		return stringJoiner.toString();
	}
	/**
	*
	*
	* */
	public static class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val,ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
