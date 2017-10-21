package moderate_prbm_ch19;

public class Trailing_0_Count_In_Factorial {
	
	public static int findTrailingZeros(int num){
		int count=0;
		if(num<0) return -1;
		for(int i=5;num/i>=0;i*=5){
				count=count+(num/i);
		}
		return count;
	}
	
	public static int findFactorial(int num){
		int fact=1;
		if(num==0 || num ==1)
			return fact;
		else{
			for(int i=2; i<=num;i++){
				fact=fact*i;
			}
		}return fact;
	}

	public static void main(String[] args) {
		int n=10;
		int factorial=0, trailingZeros=0;;
		factorial=findFactorial(n);
		System.out.println("factorial of "+ n+ " is : "+factorial);
		trailingZeros=findTrailingZeros(n);
		System.out.println("number of trailingZeros : "+trailingZeros);

	}

}
