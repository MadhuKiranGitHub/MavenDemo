package recursion;

public class findFibonacci {
	//Recursive solution
	public static int fibonacci(int n){
		int fib=0,fib1=1,fib2=1;
		if(n<0) return -1;
		else if(n==0) return 0;
		else if(n==1) return 1;
		else if(n>1)
			return fibonacci(n-1)+fibonacci(n-2);
		else return -1;
		
	}
	
// Iterative solution	
//	public static int fibonacci(int n){
//		if(n<0) return -1;
//		if(n==0) return 0;
//		int fib=0,fib1=1,fib2=1;
//		for(int i=3;i<=n;i++){
//			fib=fib1+fib2;
//			fib1=fib2;
//			fib2=fib;
//		}
//		return fib2;
//	}
	public static void main(String[] args) {
		int n=6;
		//for(int i=0;i<n;i++){ 	//fibonacci numbers upto n
			int fibo=fibonacci(6); //nth fibonacci number
			System.out.println(fibo);
		//}
		
	}

}
