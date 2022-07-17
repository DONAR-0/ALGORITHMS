package aw.some;

/**
* Matrix Multiplication
*/
public class Scenario09 {

	private int rows;
	private int columns;

	public int[][] data;

	private Scenario09(int rows,int columns) {
		this.rows = rows;
		this.columns = columns;
		data = new int[rows][columns];
	}
	
	public Scenario09(int[][] data) {
		this.data = data;
		this.rows = data.length;
		this.columns = data[0].length;
	}

	public Scenario09 multiply(Scenario09 other){
		if (this.columns != other.rows) {
			throw new IllegalArgumentException("Columns does not match the value of the other");
		}
		int[][] product = new int[this.rows][other.rows];
		int sum = 0;
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < other.columns; j++) {
				for (int k = 0; k < other.rows; k++) {
					sum = sum + data[i][k] * other.data[k][j];
				}
				product[i][j] = sum;
			}
		}
		return new Scenario09(product);
	}
}
