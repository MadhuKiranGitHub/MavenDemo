import java.util.Scanner;

public class addMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
			System.out.println("enter row value");
			int row=s.nextInt();
			System.out.println("enter column value");
			int column=s.nextInt();
			int[][] arr1=new int[row][column];
			int[][] arr2=new int[row][column];
			int[][] sum=new int[row][column];
		
		System.out.println("enter values of array1");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr1[i][j]=s.nextInt();
				
			}
						
		}
		System.out.println("enter values of array2");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr2[i][j]=s.nextInt();
				
			}
						
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				sum[i][j]=arr1[i][j]+arr2[i][j];
				
			}
						
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				
				System.out.print("\t" +sum[i][j]);
			}
			System.out.println();
						
		}
	
	}

}
