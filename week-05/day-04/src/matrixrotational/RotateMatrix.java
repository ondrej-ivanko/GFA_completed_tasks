package matrixrotational;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};

		matrixTurner(3/2, matrix);
		displayMatrix(3, matrix);
		rotate90Clockwise(matrix);
		displayMatrix(3, matrix);
	}

	public static void matrixTurner(int num, int[][] matrix) {
			// Consider all squares one by one
			for (int x = 0; x < num / 2; x++) {
				// Consider elements in group of 4 in
				// current square
				for (int y = x; y < num-x-1; y++) {
					// store current cell in temp variable
					int temp = matrix[x][y];

					// move values from right to top
					matrix[x][y] = matrix[y][num-1-x];

					// move values from bottom to right
					matrix[y][num-1-x] = matrix[num-1-x][num-1-y];

					// move values from left to bottom
					matrix[num-1-x][num-1-y] = matrix[num-1-y][x];

					// assign temp to left
					matrix[num-1-y][x] = temp;
				}
			}
	}

	static void displayMatrix(int num, int[][] matrix)
	{
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num; j++)
				System.out.print(" " + matrix[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void rotate90Clockwise(int[][] matrix) {
		// Traverse each cycle
		for (int i = 0; i < 3 / 2; i++) {
			for (int j = i; j < 3 - i - 1; j++) {

				// Swap elements of each cycle
				// in clockwise direction
				int temp = matrix[i][j];
				matrix[i][j] = matrix[3 - 1 - j][i];
				matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
				matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
				matrix[j][matrix.length - 1 - i] = temp;
			}
		}
	}
}
