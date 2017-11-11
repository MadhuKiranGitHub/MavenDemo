import java.util.*;

public class comIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comIn2Arrays comm= new comIn2Arrays();
		int [] arr1 = { 2,3,6,4,5};
		int [] arr2= { 3,8,4,9,7,2};
		
		Set<Integer> hmap = new HashSet<Integer>();
		for(int i : arr1){
			if(!hmap.contains(i)){
				hmap.add(i);
				System.out.println(i + "is added to set");
				
			}
			else{
				System.out.println(i + "is common");
			}
		
		}
		
		
		/*
		 * Set<Integer> set= new HashSet<Integer>();
		
	
	 
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					set.add(arr1[i]);
				}
			}
			
		}
		System.out.println(set);  */ 
		
		
		
		
	}

}
