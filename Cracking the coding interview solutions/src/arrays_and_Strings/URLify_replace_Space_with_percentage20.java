package arrays_and_Strings;

import java.util.Scanner;

public class URLify_replace_Space_with_percentage20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur 1st input String");
		char[] input=s.nextLine().toCharArray();
		int space=0;
		int length=input.length;
		for(int i=0;i<length;i++){
			if(input[i]==' '){
				space++;
			}			
		}
		int newlength=length+(space*2);
		char[] newarr=new char[newlength];
		if(newlength<length)
			input[newlength]='\0';
		for(int i=length-1;i>=0;i--){
			if(input[i]==' '){
				newarr[newlength-1]='0';
				newarr[newlength-2]='2';
				newarr[newlength-3]='%';
				newlength=newlength-3;
			}
			else{
				newarr[newlength-1]=input[i];
				newlength--;
			}
		}
		for(int i=0;i<newarr.length;i++){
			System.out.print(newarr[i]);
		}
	}

}
