package sorting_and_searching;

public class Sparse_Search {
	public static int search(String[] a,int low,int high,String key){
		int mid=(low+high)/2;
		if(a[mid].isEmpty()){
			int left=mid-1;
			int right=mid+1;
			while(true){
				if(left<low && right >high){
					return -1;
				}
				if(right<=high && !(a[right].isEmpty())){
					mid=right;					
					break;
				}
				else if(left >=low && !(a[left].isEmpty())){
					mid=left;
					break;
				}
				right++;
				left--;
			}
			
		}	
		if(key.compareTo(a[mid])==0){				
			return mid;
		}
		else if(key.compareTo(a[mid])>0){
			return search(a,mid+1,high,key);				
		}
		else{
			return search(a,low,mid-1,key);	
		}				
	}

	public static void main(String[] args) {
		String[] str={"at","","","","ball","","","cat","","","","","doll"};
		String find="cat";
		int res=search(str,0,str.length-1,find);
		System.out.println(res);

	}

}
