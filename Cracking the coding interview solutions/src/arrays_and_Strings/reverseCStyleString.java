package arrays_and_Strings;

import java.util.Scanner;

public class reverseCStyleString {
	
	public static void reverse(String str){
		int i=0;
		int j=str.length()-1;
		char[] resultArray=str.toCharArray();
		while(i<j){
			char temp=resultArray[i];
			resultArray[i]=resultArray[j];
			resultArray[j]=temp;
			i++;
			j--;
		}
		//String result=resultArray.toString();
		for(int k=0;k<resultArray.length;k++){
			System.out.print(resultArray[k]);
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur input String");
		String input=s.nextLine();
		reverse(input);
		
	}

}
