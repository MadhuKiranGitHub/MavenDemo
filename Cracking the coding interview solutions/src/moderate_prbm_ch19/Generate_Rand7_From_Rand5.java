package moderate_prbm_ch19;

public class Generate_Rand7_From_Rand5 {
	public static int rand7() {
		while (true) {
			int num = 5 * rand5() + rand5();
			if (num < 21) {
				return num % 7+1;
			}
		}
	}

	public static int rand5() {
		return (int) (Math.random() * 100) % 5;
	}

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		System.out.println(rand7());
	
	}
}
