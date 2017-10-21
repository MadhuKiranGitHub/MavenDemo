package moderate_prbm_ch19;

public class Sequence_With_Large_Sum {

	public static void main(String[] args) {
		int[] a={2,-8,3,-2,4,-10};
		int sum=0,maxSum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(maxSum < sum){
				maxSum=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		
		System.out.println("maxSum= " +maxSum);

	}

}
