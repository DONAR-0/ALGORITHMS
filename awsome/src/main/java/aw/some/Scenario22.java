package aw.some;

import static java.lang.String.format;
/**
* Scenario22 : Array values 
*/
public class Scenario22 {

	private int arr[];
	private int size;
	
	public Scenario22(){}

	/**
	* Initialize {@link Scenario22}
	*
	* */
	public Scenario22(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	
	/**
	*  Two ways to the insert 
	*  1. if value a position need to be repalced 
	*  2. move the values to the other side 
	*  
	* */
	public int insert(int value,int position) {
		int insertValue = value;
		if (position > size + 1) {
			throw new ArrayIndexOutOfBoundsException(format("%d suggested index is out of index",position)); 
		}
		if(position < size) {
			arr[position] = insertValue;
		}
		return 0;
	}
}
