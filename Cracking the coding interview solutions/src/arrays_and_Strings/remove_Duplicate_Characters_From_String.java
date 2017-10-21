package arrays_and_Strings;
/*
 * Not Completed
 */

import java.util.Arrays;
import java.util.Scanner;

public class remove_Duplicate_Characters_From_String {
	public static char[] removeDuplicates(char[] str) {
		 if (str == null) 
			 return str;
		 int len = str.length;
		 if (len < 2) 
			 return str;
		
		 int tail = 1;	
		 for (int i = 1; i < len; ++i) {
			 int j;
			 for (j = 0; j < tail; ++j) {
				 if (str[i] == str[j])
					 break;
			 }
			 if (j == tail) {
				 str[tail] = str[i];
				 ++tail;
			 }
		 }
		 str[tail] = 0;
		 return str;
	 }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur input String");
		String input=s.nextLine();
		char[] charArr=input.toCharArray();
		
		Arrays.sort(charArr);
		char[] res=removeDuplicates(charArr);
		for(int i=0;i<charArr.length;i++)
		System.out.print(charArr[i]);
		
	}

}
