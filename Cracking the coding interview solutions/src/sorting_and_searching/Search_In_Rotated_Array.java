package sorting_and_searching;

public class Search_In_Rotated_Array {
	public static int search(int[] arr, int left, int right, int key){
		int mid=(left+right)/2;
		if(key==arr[mid]){
			System.out.println(key+" found at -> "+ (mid+1)+ " position");
			return 1;
		}
		if(arr[left]<arr[mid]){
			if(key >=arr[left] && key<arr[mid]){
				return search(arr,left,mid-1,key);
			}else{
				return search(arr,mid+1,right,key);
			}
		}else if(arr[mid]<arr[right]){
			if(key>arr[mid]&& key <=arr[right]){
				return search(arr,mid+1,right,key);
			}else{
				return search(arr,mid-1,left,key);
			}
			
		}
		
		System.out.println("key not found");
		return -1;
	}
	public static void main(String[] args) {
		int[] array={20,25,30,40,1,5,10,15,};
		int key=25;
		search(array,0,array.length-1,key);
	}

}
