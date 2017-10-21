package arrays_and_Strings;

public class Matrix_mxn_if0_Make_Row_Column_Zero {
	public static void SetZero( int [][] matrix, int m, int n )
	{
	    boolean[] row = new boolean[m];
	    boolean[] column = new boolean[n];
	    for( int i = 0; i < m; i++ ){
	        for( int j = 0; j < n; j++ ){
	            if( matrix[i][j] == 0 ){
	                row[i] = true;            
	                column[j] = true;
	            }
	        }
	    }
	    for( int i = 0; i < m; i++ ){
	        if( row[i] ){
	            for( int j = 0; j < n; j++ ){
	                matrix[i][j] = 0;
	            }
	        }
	    }
	    for( int j = 0; j < n; j++ ){
	        if( column[j] ){
	            for( int i = 0; i < m; i++ ){
	                matrix[i][j] = 0;
	            }
	        }
	    }
	    for( int i = 0; i < m; i++ ){
	    	for( int j = 0; j < n; j++ ){
	                System.out.print(matrix[i][j]+ " ");
	            }	
	    	System.out.println();
	    }
	    

	}
	public static void main(String[] args) {
		int[][] arr={{2,5,0,3},{1,4,5,9},{6,7,8,5}};
		System.out.println("row size"+ arr.length);
		System.out.println("Column Size"+ arr[0].length);
		SetZero(arr,arr.length,arr[0].length);

	}

}
