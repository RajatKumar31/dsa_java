package Arrays_2D;

class rotate_matrix_90_degree {

	public static void rotate(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		// transpose the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// reverse each row
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][cols - j - 1];
				matrix[i][cols - j - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
