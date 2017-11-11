
public class fibonacci {

	public static int fib(int n){
		if(n<0)
		{
			return -1;
		}
		else if(n==0||n==1){
			return 1;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String [] args){
		int val=4,v=0;
		for(int i=0;i<=val;i++){
			v=fib(i);
		System.out.print(v+" ");
		}
	}
}
