package moderate_prbm_ch19;

public class Swap2Numbers_Without_Buffer {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("a="+ a+" : b="+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a="+ a+" : b="+ b);
	}
	
	
}
