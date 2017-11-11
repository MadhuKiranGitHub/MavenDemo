
public class addDigitsInInteger {
	
	public static void addNumbers(int n){
		int sum=0,quotient=0,remainder=0;
		while(n!=0){
			remainder=n%10;
			System.out.println("Rem: "+remainder);
			quotient=n/10;
			n=quotient;
			sum=sum+remainder;
		}
		System.out.println("Sum :"+sum);
	}
	public static void main(String[] args){
		int num=123;
		addNumbers(num);
	}
}
