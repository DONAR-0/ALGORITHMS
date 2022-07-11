package aw.some;


/**
* Searching in sorted 2 dimmesion matrix
* Optimal solution would be log n
*
**/
public class Scenario03 {
	
	/**
	* Finding value in a sorted matrix
	*
	* @param matrix
	* @param value
	* @return
	*/
	public boolean findValueInSortedMatrixNLOGN(int[][] matrix,int value) {
		//TODO:
		//1. map out the values
		//2. location
		for (int i = 0; i < matrix.length; i++) {
			
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
}
