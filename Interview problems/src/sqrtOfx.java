
public class sqrtOfx {
	

	    public int mySqrt(int x) {
	        if(x <= 0) return 0;
	        int l = 1, r = x, res = 1;
	        while(l < r) {				//1<9		l<5 			4<5
	            int mid = (l + r) / 2; //mid 5,		3				
	            if(mid > x/mid) { //5 > (9/5=1)		3 > (9/3=3)
	                r = mid;		//r= 5
	            } else {
	                res = mid;						//res=3;		
	                l = mid + 1;					//l=4;			
	            }
	        }
	        return res;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		sqrtOfx sq=new sqrtOfx();
		int res=sq.mySqrt(n);
		System.out.println(res + " :is the sqrt of : "+ n);

	}

}
