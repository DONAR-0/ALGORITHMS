package aw.some;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
/**
* Scenario22 : Array values 
*/
public class Scenario22 {

	private int arr[];
	private int size;
	private int capacity;
	private static final int DEFAULT_CAPACITY = 16;
	public Scenario22(){
		this(DEFAULT_CAPACITY);	
	}

	/**
	* Initialize {@link Scenario22}
	*
	* */
	public Scenario22(final int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.size = 0;
	}

	public void addElement(final int element){
		Objects.requireNonNull(element,"Elements can not be null");
		if (this.arr.length == this.capacity) {
			this.arr = Arrays.copyOf(arr, newCapacity(2 * this.capacity));
		}
		this.arr[this.size] = element;
		size++;
	}
	
	public int newCapacity(int capacity){
		this.capacity = capacity;
		return this.capacity;
	}

	/**
	*  Two ways to the insert 
	*  1. if value a position need to be repalced 
	*  2. move the values to the other side 
	*  
	* */
	public int insert(int value,int position) {
		this.arr[position]=value;
		return this.arr[position];
	}

	public String print(){
		StringJoiner stringJoiner = new StringJoiner(" -> ");
		for (int i = 0;i < arr.length;i++) {
			stringJoiner.add(""+arr[i]);
		}
		return stringJoiner.toString();
	}
}
