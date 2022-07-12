package aw.some;

/**
* Singly Linked list
*
*/
public class Scenario04 {
	private ListNode head;

	public Scenario04(ListNode head) {
		this.head = head;
	}
	
/******************************************************/
	/**
	* Add Node to the linked list
	*
	* @param node
	*/
	public void add(ListNode node) {
		ListNode curr = head;
		while (curr != null) {
			if (curr.nextNode == null) {
				curr.nextNode = node;
				break;
			}
			curr = curr.nextNode;
		}
	}

/******************************************************* */
	/**
	 * Print the singly linked list
	 * 
	 * */
	public void print() {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.dataInTheNode + " ");
			curr = curr.nextNode;
		}
		System.out.println("");
	}
/********************************************************** */
	public void reverse(){
		ListNode pointer = head;
		ListNode previous = null,current = null;
		while (pointer != null) {
			current = pointer;
			pointer = pointer.nextNode;
			
			// reverse the link
			current.nextNode = previous;
			previous = current;
		}
		head = current;
	}

	static class ListNode {
		int dataInTheNode;
		ListNode nextNode;

		public ListNode(int dataInTheNode) {
			this.dataInTheNode = dataInTheNode;
		}

		public int getDataInTheNode() {
			return this.dataInTheNode;
		}

		public ListNode getNextNode() {
			return this.nextNode;
		}
	}
}

