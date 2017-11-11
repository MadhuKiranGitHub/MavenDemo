
public class sumOfSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String();
		str="1234";
		int temp=0;
		int result=0;
		for(int i=0;i<str.length();i++){
			temp=temp*10+(str.charAt(i)-'0')*(i+1);
			result= result+temp;
		
		System.out.println(result);
		}
	}

}
