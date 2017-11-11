import java.util.*;
public class findDupInArray {

	public void dupCheck(int[] array){
		Set<Integer> arrSet= new HashSet<Integer>();
		int count = 0;
		for(int i : array){
			if(!arrSet.contains(i)){
				arrSet.add(i);
			}
			else{
				count++;
				
			}
		}
		System.out.println(arrSet);
		System.out.println(count + "duplicates");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDupInArray ar= new findDupInArray();
		int[] array = {1,2,4,6,5,5,4,2};
		
		ar.dupCheck(array);
	}

}
