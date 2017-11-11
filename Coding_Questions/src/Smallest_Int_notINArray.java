import java.util.Arrays;

public class Smallest_Int_notINArray {

	//Not working(Prbm from codility)
	    public static int solution(int[] A, int[] n) {
	        // write your code in Java SE 8
	        int min=999;
	        int i=1;
	        while(i<A.length){
	        	if(Arrays.binarySearch(A, A[i]) < 0){
	 	       	   min=n[i];
	 	       	   System.out.println("Inside array loop "+ min);
	 	       	   return min;
	 	       	  
	 	        }
	        	else{
	 	        	i++;
	 	        }
	       		
	        }	        	
	        min=n[i];
	        System.out.println("Not in loop "+min);
	        return min;
	    }
	
	public static void main(String[] args) {
		int[] A={1,-1,4};
		int[] n={1,2,3,4,5};
		
		solution(A,n);
	}

}
