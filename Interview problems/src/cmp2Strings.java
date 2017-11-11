
public class cmp2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Madh";
		String s2= "Madhu";
		int result=s1.compareTo(s2);
		if(result==0){
			System.out.println("strings are euql");
			
		}
		else if(result >= 1){
			System.out.println("s1 is greater");
		}
		else if(result < 1){
			System.out.println("s2 is greater");
		}

	}

}
