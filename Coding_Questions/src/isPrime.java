import java.util.Scanner;

public class isPrime {
	public static String checkPrime(int n){
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				//System.out.println(n + " is not prime");
				return "is not prime";
			}
			
						
			
		}
		return "is prime";

	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int input=scan.nextInt();
		String result= checkPrime(input);
		
		System.out.println(result);
	}
}
