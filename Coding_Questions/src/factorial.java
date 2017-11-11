
public class factorial {

	public static int fact(int n){
		if(n<0)
		{
			return -1;
		}
		else if(n==0){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	
	public static void main(String [] args){
		int val=fact(3);
		System.out.println(val);
	}
}
