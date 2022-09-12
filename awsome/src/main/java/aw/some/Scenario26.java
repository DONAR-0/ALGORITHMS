package aw.some;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
 * 
 */
public class Scenario26<Item> implements Iterable<Item> {

    private int n;
    private Node first;
    
    public Scenario26() {
        first = null;
        n = 0;
        assert check();
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * Is this stack empty ?
     * 
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the numbers of items in the stack.
     * @return the number of items in the stack
     */
    public int size() {
        return n;
    }

    /**
     * Add the item to this stack
     * 
     * @param item the item need to add
     */
    public void push(Item item) {
       Node oldFirst = first;
       first = new Node();
       first.item = item;
       first.next = oldFirst;
       n++;
       assert check();
    }

    /**
     * Removes and Returns the items most recently addded to this stack
     * 
     * @return the items most recently added 
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) {
           throw new NoSuchElementException("Stack underflow"); 
        }
        Item item = first.item;
        first = first.next;
        n--;
        assert check();
        return item;
    }

    /**
     * Returns (but does not remove) the item most recently added to this stack.
     * @return the item most recently added to this stack.
     * @throws NoSuchElementException if the stack empty.
     */
    public Item peek() {
            if (isEmpty()) {
               throw new NoSuchElementException("Stack Overflow"); 
            }
            return first.item;
    }
    
    private boolean check() {
        return false;
    }

}