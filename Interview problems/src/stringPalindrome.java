
public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="momom";
	StringBuffer str=new StringBuffer(s);
	String rev=str.reverse().toString();
	if(s.equals(rev)){
		System.out.println("valid palindrome");
	}
	else{
		System.out.println("not a palindrome");
	}
	}

}
