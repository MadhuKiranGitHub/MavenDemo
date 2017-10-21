package sorting_and_searching;

public class Sorted_Merge_ALargeEnoughBuffer {

	public static void merger(int[] a, int[] b, int lenA,int lenB){
		int indexA=lenA-1;
		int indexB=lenB-1;
		int mergeIndex=lenA+lenB-1;
	
		
		while(indexB >=0){
			if(a[indexA]>b[indexB]){
				a[mergeIndex]=a[indexA];
				indexA--;
			}else{
				a[mergeIndex]=b[indexB];
				indexB--;
			}
			mergeIndex--;
		}
		
		
	}
	public static void main(String[] args) {
		int [] a={2,4,6,8,0,0,0,0};
		int [] b={3,5,7,9};
		merger(a,b,4,4);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
	}

}
