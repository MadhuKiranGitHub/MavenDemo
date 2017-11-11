import java.util.*;
public class revString {
/** Using StringBuilder*/
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="hello";
	   String rev = new StringBuilder(input).reverse().toString();
		System.out.println(rev);
		}*/
	
	//Without StringBuuilder
	public static void main(String []args){
		String input = "hello world";
		char[] array= input.toCharArray();
		int length= input.length()-1;
		for(int i=length;i>=0;i--){
		
		System.out.print(array[i]);
		}
	}
}


