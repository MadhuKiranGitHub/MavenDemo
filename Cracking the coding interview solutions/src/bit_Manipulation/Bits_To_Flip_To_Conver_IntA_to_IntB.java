package bit_Manipulation;

public class Bits_To_Flip_To_Conver_IntA_to_IntB {
	public static int bitSwapRequired(int a, int b) {
		int count = 0;
		for (int c = a ^ b; c != 0; c = c >>> 1) { 
			count += c & 1;
		}
		return count;
	}
	public static String toFullBinaryString(int a) {
		String s = "";
		for (int i = 0; i < 32; i++) {
			Integer lsb = new Integer(a & 1);
			s = lsb.toString() + s;
			a = a >> 1;
		}
		return s;
	}
	public static void main(String[] args) {
		int a = -32;
		int b = 32;
		System.out.println(a + ": " + toFullBinaryString(a));
		System.out.println(b + ": " + toFullBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
	}
}
