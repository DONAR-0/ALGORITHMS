package aw.some;

import java.util.StringJoiner;

import lombok.val;

/**
* Scenario18
*/
public class Scenario18 {

	/**
	*
	*
	* */
	public ListNode mergeTwoList(ListNode listNode1,ListNode listNode2) {
		return null;
	}

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
