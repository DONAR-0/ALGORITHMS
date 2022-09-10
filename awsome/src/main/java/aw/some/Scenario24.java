package aw.some;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
* Scenario24
* Resizing Array stack
*
*/
public class Scenario24<Item> implements Iterable<Item> {

	private static final int INIT_CAPACITY = 8;
	
	private Item[] a; 	// array of item
	private int n;		// number of element in stack
	
	/***
	* Init an empty stack
	*
	* */
	public Scenario24() {
		a = (Item[]) new Object[INIT_CAPACITY];
		n = 0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}

	public int size(){
		return n;
	}

	private void resize(int capacity) {
		if (capacity <= n) {
			throw new IllegalArgumentException("capacity has to be greater than"+n);
		}
		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < n; i++) {
			copy[i]	= a[i];
		}
		a = copy;
		
	}

	public void push(Item item) {
		if (n==a.length) {
			resize(2 * a.length);	
		}
		a[n++] = item;
	}

	public Item pop(){
		if (isEmpty()) {
			throw new NoSuchElementException("Stack Overflow");
		}
		Item item = a[n -1];
		a[n - 1 ] = null;
		n--;
		if (n > 0 && n == a.length/4) {
			resize(a.length / 2);	
		}
		return item;
	}
	
	public Item peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack Overflow");	
		}
		return a[n -1];	
	}

	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i;
		public ReverseArrayIterator(){
			i = n-1;
		}

		public boolean hasNext(){
			return i >= 0;
		}

		public void remove(){
			throw new UnsupportedOperationException("Operation is not supported");
		}

		public Item next(){
			if (!hasNext()) {
				throw new NoSuchElementException("No Element is present what soevr");
			}
			return a[i--];
		}
	}

}
