package sorting_and_searching;

public class Sorted_Matrix_Search {

	public static int search(int[][]mat,int key){
		int row=0;
		int col=mat.length-1;
		while(row<mat.length && col>=0){
			if(mat[row][col]==key){
				System.out.println("key found at -> "+(row+1)+ "row : " +(col+1)+"column");
				return 1;
			}else if(key > mat[row][col]){
				row++;
			}else{
				col--;
			}
		}
		System.out.println("key not found");
		return -1;
	}
	public static void main(String[] args) {
		int[][] matrix={{1,2,4,7},
				   {3,8,9,10},
				   {5,11,12,13},
				   {14,15,16,17}};
		
		
		int key=6;
		
		search(matrix,key);
	}

}
