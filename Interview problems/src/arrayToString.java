
public class arrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[]{"a","r","r","a","y"};
		String str=array[0];
		for(int i = 1 ; i< array.length;i++){
		str=str+array[i].toString();
		//System.out.println("array elements \t " + array[i]);
		
		}
		System.out.println("String is:  " +str);
	}

}
