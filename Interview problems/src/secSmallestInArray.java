import java.util.ArrayList;

public class secSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,6,8,2};
		int max=arr[0];	
		int secMax=arr[0];
			for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			for(int j: arr){
				if(j<max && j>i){
					secMax=j;
					
				}
			}
			
		}
			
			System.out.println("Max :"+ max);
			System.out.println("second MAx : " +secMax);
			
	}

}
