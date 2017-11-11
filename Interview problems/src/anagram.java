
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="rat";
		char[] chars1=s1.toCharArray();
		String s2="tar";
		char[] array= new char[26];
		for(int i=0;i<s1.length()-1;i++){
			array[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length()-1;i++){
			array[s2.charAt(i)]--;
		}
		for(int i=0;i<array.length-1;i++){
			if(array[i]==1){
		
			}
		}
	}

}
