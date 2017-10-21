package hard_Ch20;

public class Max_Sum_SubMAtrix {
	public static SubMatrix getMaxMatrix(int[][] matrix) {
		int rowCount = matrix.length;
		int columnCount = matrix[0].length;
		SubMatrix best = null;
		for (int row1 = 0; row1 < rowCount; row1++) {
			for (int row2 = row1; row2 < rowCount; row2++) {
				for (int col1 = 0; col1 < columnCount; col1++) {
					for (int col2 = col1; col2 < columnCount; col2++) {
						int sum = sum(matrix, row1, col1, row2, col2);
						if (best == null || best.getSum() < sum) {
							best = new SubMatrix(row1, col1, row2, col2, sum);
						}
					}
				}
			}
		}
		return best;
	}
	
	private static int sum(int[][] matrix, int row1, int col1, int row2, int col2) {
		int sum = 0;
		for (int r = row1; r <= row2; r++) {
			for (int c = col1; c <= col2; c++) {
				sum += matrix[r][c];
			}
		}
		return sum;
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
		int[][] matrix = randomMatrix(10, 10, -5, 5);
		printMatrix(matrix);
		SubMatrix sub = getMaxMatrix(matrix);
		System.out.println(sub.toString());
	}
	

public static class SubMatrix {
	private int row1, row2, col1, col2, sum;
	public SubMatrix(int r1, int c1, int r2, int c2, int sm) {
		row1 = r1;
		col1 = c1;
		row2 = r2;
		col2 = c2;
		sum = sm;
	}
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public String toString() {
		return "[(" + row1 + "," + col1 + ") -> (" + row2 + "," + col2 + ") = " + sum + "]";
	}
}

}
