package aw.some;

import java.util.Arrays;

/**
 * Dynamic Array
 *
 * */
public class Scenario01<E> {
	private static final int DEFAULT_CAPACITY = 16;

	private int capacity;
	private int size;
	private Object[] objects;

	/**
	 * Constructor
	 * */
	public Scenario01(final int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.objects = new Object[capacity];
	}

	public Scenario01() { this(DEFAULT_CAPACITY); }

	/**
	 *Adds
	 * Big O = o(n)
	 * */
	public void add(final E element) {
		if (this.size == this.objects.length) {
			this.objects =
				Arrays.copyOf(this.objects, newCapacity(2 * this.capacity));
		}
		this.objects[this.size] = element;
		size++;
	}

	/**
	 * Put value in Dynamic Array
	 * Big O = o(n)
	 * */
	public void put(final int index, E element) { this.objects[index] = element; }

	/**
	 * Big O = o(1)
	 *
	 * */
	public E get(final int index) { return getElement(index); }

	private E getElement(final int index) { return (E)this.objects[index]; }

	/**
	 * Remove an element
	 * Big O = o(n)
	 *
	 * */
	public E remove(final int index) {
		final E oldELement = get(index);
		fastRemove(this.objects, index);
		if (this.capacity > DEFAULT_CAPACITY && size * 4 <= this.capacity) {
			this.objects =
				Arrays.copyOf(this.objects, newCapacity(this.capacity / 2));
		}
		return oldELement;
	}

	private void fastRemove(final Object[] elements, final int index) {
		final int newSize = this.size - 1;
		if (newSize > index) {
			System.arraycopy(elements, index + 1, elements, index, newSize - index);
		}

		elements[this.size = newSize] = null;
	}

	/**
	 * new Capacity values
	 *
	 * */
	private int newCapacity(int capacity) {
		this.capacity = capacity;
		return this.capacity;
	}
}
