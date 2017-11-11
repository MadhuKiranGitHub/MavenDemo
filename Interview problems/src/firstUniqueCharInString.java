import java.util.*;
public class firstUniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="narayana";
		char[] cstr=str.toCharArray();
	
		for(int i = 0; i<str.length()-1;i++){
			
			if(str.indexOf(cstr[i])==str.lastIndexOf(cstr[i])){
				System.out.println(cstr[i]+" : is unique");
				break;
			}
		}
	}

}
