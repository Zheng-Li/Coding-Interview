package chapter_1;

public class Rotation {
	private int matrix_size;
	private int[][] matrix;
	
	//Rotate the matrix by 90 degree
	public Rotation(int size) {
		if(size > 0) {
			this.matrix_size = size;
			this.matrix = new int[size][size];
			System.out.println("This is the original matrix:");
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					matrix[i][j] = i*10 + j;
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		} else {
			System.out.println("Unexpected matrix size...");
		}
	}
	
	public int[][] clockwise_rotate(int[][] source, int source_size) {
		System.out.println("After one rotation:");
		int[][] matrix_after = new int[source_size][source_size];
		for(int i=0; i<source_size; i++) {
			for(int j=0; j<source_size; j++) {
				matrix_after[i][j] = source[Math.abs(j - source_size + 1)][i];
				System.out.print(matrix_after[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return matrix_after;
	}
	
	public int[][] counter_clockwise_rotate(int[][] source, int source_size) {
		System.out.println("After one rotation:");
		int[][] matrix_after = new int[source_size][source_size];
		for(int i=0; i<source_size; i++) {
			for(int j=0; j<source_size; j++) {
				matrix_after[i][j] = source[j][Math.abs(i - source_size + 1)];
				System.out.print(matrix_after[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return matrix_after;
	}
	
	public int[][] get_original_matrix() {
		return this.matrix;
	}
	
}
