
public class arrayEqual {

	public boolean isEqual(int[] arr1, int [] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i=0; i<arr1.length;i++){
			if(arr1[i] == arr2[i]){
				
			}
		}
		System.out.println("arrays are equal");
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[] { 1,2,3,4,5};
		int[] arr2=new int[] {1,2,3,4,5};
		
		arrayEqual ae=new arrayEqual();
		ae.isEqual(arr1,arr2);
		
		
	}

}
