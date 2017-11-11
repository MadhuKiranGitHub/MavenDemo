
public class arrTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {2,6,4,3,5};
		int target=8;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]+array[j]==target){
					System.out.println("elements"+array[i]+ ","+array[j]+ "="+"target");
				}
			}
		}
		
	}

}
