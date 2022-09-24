package aw.some;

import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.naming.NotContextException;

/***
 * The LinkedStack class represent a last-in-first-out
 * stack of generic items.
 * It supports the usual push and pop operations, along the methods for peeking
 * at the top item, testing if the stack is empty and iterating through the items in
 * LIFO order.
 * 
 * This implementation uses a singly linked list with a non-static nested class for
 * linked list nodes. 
 *
 * The push pop peek size and isEmpty operations all take constant time
 * in the worst case.
 * push
 * pop
 * peek 
 */
public class Scenario26<Item> implements Iterable<Item> {

	private static final int DEFAULT_CAPACITY = 8;
	private Item[] a;
	private int n;

	public Scenario26(){
		this(DEFAULT_CAPACITY);
	}
	public Scenario26(int size) {
		a = (Item[]) new Object[size];
		n = 0;
	}

	/***
	* pushing the value in the array 
	*
	* @param item
	*/
	public void push(Item item) {
		if ( n == a.length) resize(2 * n);
		a[n++] = item;
	}
	
	/***
	* Pop the item by setting the last value at 
	* to null
	* @return Item is going to be popped
	*/
	public Item pop() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		Item item = a[n - 1];
		a[n - 1] = null;
		n --;
		// shrink size of array if necessary
		if ( n > 0 && n == a.length/4) resize(a.length/2);
		return item;
	}

	public Item peek() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		Item peekedItem = a[n - 1];
		return peekedItem;
	}
	
	/***
	* As the item pushing catching up with the list 
	* we need to resize
	*
	* @param capacity
	*/
	private void resize(int capacity) {
		assert capacity > n;

		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < a.length; i++) {
			copy[i] = a[i];
		}
		// assign an array
		a = copy;
		// alternative implementation
		// a = java.util.Arrays.copyOf(a, capacity);
	}

	/***
	* return false if isEmpty
	*
	* @return boolean true/false
	*/
	public boolean isEmpty(){
		return this.n == 0;
	}
	
	/***
	* Returns the size of list
	* @return return the size
	*/
	public int size() {
		return this.n;
	}

	/***
	 * Sample {@link Iterator}
	 * will give reverse values of the same
	 */
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> {
		private int i;

		public ReverseArrayIterator() {
			i = n -1;
		}

		public boolean hasNext() {
			return i >= 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			return a[i--];
		}
	}
}
