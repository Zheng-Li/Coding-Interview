package chapter_1;

import java.util.Random;

public class Clear_zero {
	private int[][] matrix;
	private int row;
	private int column;
	
	//Mark the columns and rows that have 0 in it
	public Clear_zero(int row, int column) {
		this.matrix = new int[row][column];
		this.row = row;
		this.column = column;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				Random random = new Random();
				matrix[i][j] = random.nextInt(9);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//Cross reference with the true-false table created above and rebuilt the matrix
	public void clear() {
		//find out the row/column that has 0, indicate it with boolean set
		int[][] matrix_clear = new int[row][column];
		boolean[] row_with_zero = new boolean[row];
		boolean[] column_with_zero = new boolean[column];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(matrix[i][j] == 0) {
					row_with_zero[i] = true;
					column_with_zero[j] = true;
				}
			}
		}
		
		System.out.println("After clearing the 0s in the array:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(row_with_zero[i] || column_with_zero[j]) {
					matrix_clear[i][j] = 0;
				} else {
					matrix_clear[i][j] = matrix[i][j];
				}
				System.out.print(matrix_clear[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
