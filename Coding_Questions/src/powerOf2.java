import java.util.Scanner;

public class powerOf2 {


	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int val=scan.nextInt();
		int value=1;
		if(val==0)
		{
			value=1;
			System.out.println(value);
		}
		
		else{
			for(int i=1;i<=val;i++){
				value=value*2;
				System.out.print(value + " ");
			}	
		}
	}
}

