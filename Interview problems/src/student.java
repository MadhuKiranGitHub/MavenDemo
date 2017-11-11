public class student {
	

	
	public static void main(String [] args){
	int n=37;
	for(int i=2;i<=n/2;i++){
		if(n%i==0){
			System.out.println("not");
			return;
		}
	
	}
	
	System.out.println("prime");
}
}
