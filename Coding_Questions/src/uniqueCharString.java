import java.util.Scanner;

public class uniqueCharString {
	//assuming ASCII character string(which includes 0 to 127 distinct characters)
	public static int isPrime(String str){
		int[] checked= new int[128];
		int unique=1;
		if(str.length()>128){
			return unique=0;
		}
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(checked[val]==1){
				return unique=0;
			}
			checked[val]=1;
		}
		return unique=1;
	}


	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String inStr= scan.nextLine();
		int val=isPrime(inStr);
		if(val==1){
			System.out.println("unique");
		}
		else{
			System.out.println("not unique");
		}
	}
	
}
