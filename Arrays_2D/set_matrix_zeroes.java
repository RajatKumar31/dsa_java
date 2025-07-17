package Arrays_2D;

class set_matrix_zeroes {

	// optimal method (reduce space complexity)
	public static void setZeroes_optimal(int[][] matrix) {

	}

	// better method (use two arrays)
	public static void setZeroes_better(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[] rowArray = new int[rows];
		int[] colArray = new int[cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					rowArray[i] = 1;
					colArray[j] = 1;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (rowArray[i] == 1 || colArray[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	// Brute force method (change values to -1)
	public static void markRows_brute_force(int[][] matrix, int i) {
		int cols = matrix[0].length;

		for (int k = 0; k < cols; k++) {
			if (matrix[i][k] != 0) {
				matrix[i][k] = Integer.MIN_VALUE;
			}
		}
	}

	public static void markCols_brute_force(int[][] matrix, int j) {
		int rows = matrix.length;
		for (int k = 0; k < rows; k++) {
			if (matrix[k][j] != 0) {
				matrix[k][j] = Integer.MIN_VALUE;
			}
		}
	}

	public static void markZero_brute_force(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == Integer.MIN_VALUE) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void setZeroes(int[][] matrix) {
		// 1 2 3 4
		// 5 6 0 8
		// 2 3 4 5
		//
		// (1,2)
		//
		// 1,0
		// 1,1
		// 1,3
		//
		// 0,2
		// 2,2
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					markRows_brute_force(matrix, i);
					markCols_brute_force(matrix, j);
				}
			}
		}
		markZero_brute_force(matrix);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 0, 8 }, { 2, 3, 4, 5 } };
		// setZeroes(arr);
		setZeroes_better(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 1 2 3 4
		// 5 6 0 8
		// 2 3 4 5
	}
}
