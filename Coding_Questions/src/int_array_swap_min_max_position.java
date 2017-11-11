
public class int_array_swap_min_max_position {

	public static int findMin(int[] a){
		int min=a[0],minIndex=0;
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	
	public static int findMax(int[] a){
		int max=a[0],maxIndex=0;
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args){
		int[] arr = {2,9,5,1,3};
		System.out.println("Initial array");
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+ " ");
		}
		
		int minPos=findMin(arr);
		System.out.println();
		System.out.println(minPos + " MinIndex");
		int maxPos=findMax(arr);
		System.out.println(maxPos+" MaxIndex");
		int temp=arr[minPos];
		arr[minPos]=arr[maxPos];
		arr[maxPos]=temp;
		System.out.println("Swapped array");
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+ " ");
		}
		
				
	}
}
