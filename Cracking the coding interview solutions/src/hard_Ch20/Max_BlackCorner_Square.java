package hard_Ch20;

public class Max_BlackCorner_Square {
	public static Subsquare findSquareWithSize(int[][] matrix, int squareSize) {
		// On an edge of length N, there are (N - sz + 1) squares of length sz.
		int count = matrix.length - squareSize + 1; 
		
		// Iterate through all squares with side length square_size.
		for (int row = 0; row < count; row++) {
			for (int col = 0; col < count; col++) {
				if (isSquare(matrix, row, col, squareSize)) {
					return new Subsquare(row, col, squareSize);
				}
			}
		}
		return null;
	}
	
	public static Subsquare findSquare(int[][] matrix){
		assert(matrix.length > 0);
		for (int row = 0; row < matrix.length; row++){
			assert(matrix[row].length == matrix.length);
		}
		
		int N = matrix.length;
		
		for (int i = N; i >= 1; i--) {
			Subsquare square = findSquareWithSize(matrix, i);
			if (square != null) {
				return square;
			}
		}
		return null;
	}	

	private static boolean isSquare(int[][] matrix, int row, int col, int size) {
		// Check top and bottom border.
		for (int j = 0; j < size; j++){
			if (matrix[row][col+j] == 1) {
				return false;
			}
			if (matrix[row+size-1][col+j] == 1) {
				return false;
			}
		}
		
		// Check left and right border.
		for (int i = 1; i < size - 1; i++) {
			if (matrix[row+i][col] == 1){
				return false;
			}
			if (matrix[row+i][col+size-1] == 1) {
				return false;
			}
		}
		return true;
	}

	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}


	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = randomMatrix(7, 7, 0, 1);
		printMatrix(matrix);
		Subsquare square = findSquare(matrix);
		square.print();
	}

	public static class Subsquare {
		public int row, column, size;
		public Subsquare(int r, int c, int sz) {
			row = r;
			column = c;
			size = sz;
		}
	
		public void print() {
			System.out.println("(" + row + ", " + column + ", " + size + ")");
		}
}

}
