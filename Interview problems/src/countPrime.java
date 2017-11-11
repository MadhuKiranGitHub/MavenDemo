
public class countPrime {
	
	public static void main(String[] args){
		int n=10;
		int count =0;
		boolean res=true;
		
		countPrime cp=new countPrime();
		for(int i=0;i<n;i++){
		res=cp.isPrime(i);
		}
		if(res == false){
			count++;
		}
		System.out.println("num of prime" + count);
	}
	
	public boolean isPrime(int n){
		for(int i = 2; i< n/2;i++){
			if(n%i == 0){
				System.out.println("not prime"+ n);
				return true;
			}
		}
		System.out.println(" num is prime"+ n);
		return false;
	}
	
}
/*
	public int numOfPrime(int n){
		boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=10;
		countPrime cp = new countPrime();
		int res=cp.numOfPrime(5);
		if(res >0){
			System.out.println("no of prime nums"+ res);
		}
		
	}

}*/
