package arrays_and_Strings;

import java.util.Scanner;

public class isUnique {
	
	public static boolean check_Unique(String str){
		boolean[] char_set=new boolean[128];
		for(int i=0;i<str.length();i++){
			if(char_set[str.charAt(i)]){
				return false;
			}
			else{
				char_set[str.charAt(i)]=true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur input String");
		String input=s.nextLine();
		boolean result=check_Unique(input);
		if(result){
			System.out.println("String is unique");
			return;
		}else{
			System.out.println("not unique");
		}
	}

}
