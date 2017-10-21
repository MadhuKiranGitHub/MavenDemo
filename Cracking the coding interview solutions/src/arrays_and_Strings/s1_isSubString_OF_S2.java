package arrays_and_Strings;

import java.util.Scanner;

public class s1_isSubString_OF_S2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur 1st input String");
		String str1=s.nextLine();
		System.out.println("enter ur 2nd input String");
		String str2=s.nextLine();
		
		String str3=str1+str1;
		if(str3.contains(str2)){
			System.out.println("is sub String");
		}else{
			System.out.println("not substring");
		}

	}

}
