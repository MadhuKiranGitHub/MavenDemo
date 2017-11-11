import java.util.*;
public class arrToArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array=new String[] {"java","c","c++","html","css","JavaScript"};
		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(array));
		
		
		System.out.print(" " +arrList);
	}

	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array={"java","c","c++","html","css"};
		
		ArrayList<String> arrList = new ArrayList<String>();
		for(int i=0;i<array.length;i++){
			arrList.add(array[i]);
		}
		
		System.out.print(" " +arrList);
	}*/
}
