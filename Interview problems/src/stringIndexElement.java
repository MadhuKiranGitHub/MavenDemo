
public class stringIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Madhu";
		int index=1;
		char[] chstr=str.toCharArray();
		System.out.println("");
		for(int i=0; i< chstr.length;i++){
			if(i==index){
				System.out.println("char at index=2 is: "+ chstr[i]);
			}
		}
	}

}
