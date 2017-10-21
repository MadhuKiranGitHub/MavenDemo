package arrays_and_Strings;

import java.util.Arrays;
import java.util.Scanner;


public class anagramStrings {
	public static boolean checkAnagram(String a1, String a2){
		if(a1.length() != a2.length()){
			return false;
		}
		int[] alphabets= new int[128];
		for(int i=0;i<a1.length();i++){
			alphabets[a1.charAt(i)]++;		
		}
		for(int i=0;i<a2.length();i++){
			alphabets[a2.charAt(i)]--;			
		}
		for(int j=0;j<alphabets.length;j++){
			if(alphabets[j]!=0){
				return false;
			}									
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur 1st input String");
		String input1=s.nextLine();
		System.out.println("enter ur 2nd input String");
		String input2=s.nextLine();
		boolean result=checkAnagram(input1,input2);
		if(result){
			System.out.println(input1 + " and "+ input2+" are anagrams");
		}else{
			System.out.println(input1 + " and "+ input2+" are not anagrams");
		}

	}
}	
	
	
	
	
/*
public class anagramStrings {
	public static boolean checkAnagram(String s1, String s2){
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur 1st input String");
		String input1=s.nextLine();
		System.out.println("enter ur 2nd input String");
		String input2=s.nextLine();
		boolean result=checkAnagram(input1,input2);
		if(result){
			System.out.println(input1 + " and "+ input2+" are anagrams");
		}else{
			System.out.println(input1 + " and "+ input2+" are not anagrams");
		}

	}

}
*/