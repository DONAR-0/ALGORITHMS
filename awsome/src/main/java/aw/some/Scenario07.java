package aw.some;

/**
* Quick Sort Algorithms
*
*/
public class Scenario07 {

	private int[] input;
	private int lenght;
	
	/**
	* Sort the numbers
	*
	* @param numbers
	*/
	public int[] sort(int[] numbers) {
		int[] empty = {0};
		if (numbers == null || numbers.length == 0) {
			return empty;
		}
		this.input = numbers;
		lenght = numbers.length;
		quickSort(0, lenght - 1);
		return input;
	}

	/**
	* Quick Sort array
	*
	* @param low
	* @param high
	*/
	private void quickSort(int low,int high) {
		int i = low;
		int j = high;

		int pivot = input[low + (high - low) / 2];
		//pivot is middle index
		while (i <= j) {
			while (input[i] < pivot) {
				i++;				
			}
			while (input[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(low, j);
		} 
		if (i < high) {
			quickSort(i, high);
		}
	}

	/**
	* Swap Values from input array
	*
	* @param i
	* @param j
	*/
	private void swap(int i,int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
