
public class toUpLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  MADHU  ";
		System.out.println("Original string---"+ str);
		String trim=str.trim();
		System.out.println("Trimmed string:"+ trim);
		String low=str.toLowerCase();
		System.out.println("lower str---"+  low);
		String up=low.toUpperCase();
		System.out.println("Upper---"+ up);
		
	}

}
