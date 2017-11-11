
public class nums {
	static int [] squares=new int[100];
	static int i=0;
	public static void isSquare(int n){

		int sq=0;
		for(int i=1;i<=n;i++){
			sq=(int)Math.pow(i, 2);
			
			if(Math.sqrt(sq)==Math.sqrt(i)){
				System.out.println("[]");
			}
			else{
				System.out.println(i);
			}
		}
		
		
	}
	public static void main(String[] args){
		

	
			 isSquare(100);
		
			
		
	}
}
