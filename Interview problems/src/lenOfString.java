
public class lenOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Madhu";
		//int length=str.length();
		//System.out.println("length of given string is-- "+ length);
		
		char[] arr= str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		System.out.println("length="+ count);
	}

}
