import java.util.*;

public class happyNumbers {

	public static int isHappy(int n){
	
		Set<Integer> set=new HashSet<Integer>();
		
		while(n!=1 && !set.contains(n)){
			set.add(n);
			int sum=0;n=sum;
		while( n !=0){
			int rem=n%10;
			sum=sum+(rem*rem);			
			n=n/10;
			
		}
		}
		if(n==1){
			return 1;
		}
		else{
		return 0;
		}
	} /*
	public static boolean isHappy(int n) {
	    if (n <= 0) return false;
	    HashSet<Integer> set = new HashSet<Integer>();
	    while(n !=1 && !set.contains(n)) {
	        set.add(n);
	        int m = n;
	        n = 0;
	        while(m != 0) {
	            n += (m%10)*(m%10);
	            m = m/10;
	        }
	    }
	    if (n == 1) return true;
	    else return false;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int res=isHappy(n);
		if(res==1){
			System.out.println("happy");
		}
		else{
			System.out.println("unhappy");
		}
			
	}
		
		
}


