package aw.some;

/**
 * SinglyLinked List about 
 * the linked list
 * */
public class Scenario02 extends Node {
	/**
	 * Head refer to the front of the list
	 *
	 * */
	private Node head;
	
	/**
	 * Size of the linked list
	 * */
	private int size;
	
	/**
	 * Init SinglyLinked
	 * */
	public Scenario02() {
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Init SinglyLinkedList with specified head node and size
	 * @param head the head of the list
	 * @param size the size of the list
	 * */
	public Scenario02(Node head, int size) {
		this.head = head;
		this.size = size;
	}
	
	/**************************************************************************************************/

	/**
	* Insert at Head
	*
	* @param x data needs to be added in front of the head
	*/
	public void insertHead(int x) {
		insertNth(x, 0);
	}

	/**
	* Insert an element at the tail
	*
	* @param dataNeedsToBeAdded data needs to be added at the list
	*
	*/
	public void insert(int dataNeedsToBeAdded) {
		insertNth(dataNeedsToBeAdded, size);
	}

	/**
	* Insert a new node at a specified position of the list
	*
	* @param data data to be stored in a new node
	* @param position position at which a new node is to be inserted
	*/
	public void insertNth(int data, int position) {
		checkBounds(position, 0, size);
		Node newNode = new Node(data);
		if (head == null) {
			/**The list is empty */
			head = newNode;
			size++;
			return;
		}
		if (position == 0) {
			/** insert at the head of the list */
			newNode.nextNode = head;
			head = newNode;
			size ++;
			return;
		}
		Node current = head;
		for (int i = 0; i < position - 1; ++i) {
			current = current.nextNode;
		}
		newNode.nextNode = current.nextNode;
		current.nextNode = newNode;
		size++;
	}
	
	/*****************************************************************************************/
	
	
	/**
	 * Delete element from the head
	 * */
	public void deleteHead() {
		deleteNth(0);
	}
	
	/**
	 * Delete Node from the tail
	 *
	 * */
	public void delete(){
		deleteNth(size - 1);
	}

	/**
	* Remove the data from the position
	*
	* @param position position of the element
	*/
	public void deleteNth(int position) {
		checkBounds(position, 0, size - 1);
		if (position == 0) {
			Node destroy = head;
			head = head.nextNode;
			destroy = null;
			/** clear to let GC do its work */
			size--;
			return;
		}
		Node current = head;
		for (int i = 0; ++i < position - 1; ++i) {
			current = current.nextNode;
		}
		Node destroy = current.nextNode;
		current.nextNode = current.nextNode.nextNode;
		destroy = null;
		size--;
	}
	
	/****************************************************************************************************/
	/**
	* Search in singly linked list
	* @param key value needs to be searched
	* @return {@link Boolean} true or false
	*/
	public boolean search(int key) {
		Node current = head;
		while (current != null) {
			if (current.dataInTheNode == key) {
				return true;
			}
			current = current.nextNode;
		}
		return false;
	}

	public int getHeadValue(){
		if (size == 0) {
			throw new IllegalAccessError("No Data is present in the head");
		}
		return this.head.dataInTheNode;
	}

	/**
	*  A simple check for the bounds
	*
	* @param position
	* @param low
	* @param high
	*/
	public void checkBounds(int position, int low, int high) {
		if (position > high || position < low) {
			throw new IndexOutOfBoundsException(position + "");
		}
	}
}

/**
 * This class is the nodes of the singly linked list List.
 * They consist of a value and a pointer to the node after them.
 *
 *
 * */
class Node {

	/**
	 * The value of the node
	 * */
	int dataInTheNode;

	Node nextNode;

	public Node() {}
	
	/**
	* 
	* Constructor
	*
	* @param value
	*/
	public Node(int value) {
	 this(value,null);
	}
	
	/**
	*  Constructor
	*
	* @param value Value to be put in the node
	* @param next Referecne to the next node
	*/
	public Node(int value, Node next) {
		this.dataInTheNode = value;
		this.nextNode = next;
	}

}
