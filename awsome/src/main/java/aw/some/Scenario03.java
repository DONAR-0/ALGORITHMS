package aw.some;

import java.util.*;

/**
* Searching in sorted 2 dimmesion matrix
* Optimal solution would be log n
*
**/
public class Scenario03 {
	
	/************************************************************************************/
	/****************************** Find Value in matrix *********************************/
	/************************************************************************************/

	/**
	* Finding value in a sorted matrix
	*
	* @param matrix
	* @param value
	* @return
	*/
	public boolean findValueInSortedMatrixinOneLoop(int[][] matrix,int length,int value) {
		// what to do
		//1. map out the values
		//2. location
		// value % matrix = x
		// value % matrix[i] = value
		int i = 0,j = length - 1;
		while (i < length && j >= 0) {
			if (matrix[i][j] == value) {
				System.out.println("Element is found at "+ i +" " +j);
				return true;
			}
			if (matrix[i][j] > value) {
				j--;
			} else {
				i++;
			}
		}
		return false;	
	}
	
	/**
	* This is first approach
	*
	* @param matrix value of mulitdimmension matrix
	* @param value value needs to be find
	* @return boolean
	*/
	public boolean findValueInSortedMatrix(int [][] matrix,int value) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (value == matrix[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	/************************************************************************************/
	/****************************** Print Values in matrix ******************************/
	/************************************************************************************/

	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		   for (int j = 0;j < matrix[i].length;j++) {
			System.out.print(matrix[i][j] + " ");
		   }	
		   System.out.println();
		}
	}

	public void printMatrix(int[][] matrix,int xValue,int yValue) {
		int j = yValue;
		int i = xValue;
		while (i < matrix.length) {
			while (j < matrix[i].length) {
				System.out.print(matrix[i][j]+" ");
				j++;
			}
		  j = 0;
		  i++;
		  System.out.println();
		}
	}

	/************************************************************************************/
	/****************************** Remove Duplicates ******************************/
	/************************************************************************************/
	
	public int[] removeDuplicates(int[] numbersWithDuplicates) {
		Arrays.sort(numbersWithDuplicates);
		int[] result = new int[numbersWithDuplicates.length];
		int previous = numbersWithDuplicates[0];
		result[0] = previous;
		
		for (int i = 1; i < numbersWithDuplicates.length; i++) {
			int ch = numbersWithDuplicates[i];
			if (previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}
		return result;
	}


	/************************************************************************************/
	/****************************** Transpose a matrix    ******************************/
	/************************************************************************************/
	
	/**
	* Transpose a matrix 
	*
	* @param matrix
	* @return
	*/
	public int[][] transposeAMatrix(int[][] matrix) {
		int[][] transposedMatrix = new int[matrix.length][matrix.length];

		for (int i = 0; i < transposedMatrix.length; i++) {
			for (int j = 0; j < transposedMatrix[i].length; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}	
		}
		return transposedMatrix;
	}

	
	/************************************************************************************/
	/****************************** Add and Subtract a matrix    *************************/
	/************************************************************************************/
	
	/**
	* Add or subtract
	*
	* @param add(1)OrSubtract(0) 
	* @param a
	* @param b
	* @return
	*/
	public int[][] addOrSubtractAMatrix(int addOrSubtract,int[][] a,int[][] b) {
		int[][] resultMatrix = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				resultMatrix[i][j] = addOrSubtract == 0 ? a[i][j] - b[i][j] : a[i][j] + b[i][j];
			}
		}
		return resultMatrix;
	}
}



