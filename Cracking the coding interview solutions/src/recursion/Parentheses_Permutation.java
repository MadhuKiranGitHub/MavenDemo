package recursion;

import java.util.ArrayList;

public class Parentheses_Permutation {
	private static ArrayList<String> gererateParens(int count){
		char[] str= new char[count*2];
		ArrayList<String> alist= new ArrayList<String>();
		addParen(alist,count,count,str,0);
		return alist;
		
	}

	private static void addParen(ArrayList<String> alist, int left, int right, char[] str, int index) {
		if(left<0 || right<left) // error condition
			return;
		if(left==0 && right==0){
			alist.add(String.copyValueOf(str));
		}
		else{
			str[index]='(';
			addParen(alist,left-1,right,str,index+1);
			
			str[index]=')';
			addParen(alist, left, right-1,str,index+1);
		}
	}

	public static void main(String[] args) {
		int n=3;
		ArrayList<String> res= new ArrayList<String>();
		res=gererateParens(n);
		for(String s:res){
			System.out.print(s+ " ");
		}

	}

}
