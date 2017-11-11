
public class revInteger {

	public static void main(String[] args){
		int input=321;
		int remainder=0;
		int value=0,result=0;
		
		while(input!=0){
		remainder=input%10;
		value=input/10;
		result=result*10 +remainder;
		input=value;
		}
		System.out.println("revinteger"+result);
		
	}
}
