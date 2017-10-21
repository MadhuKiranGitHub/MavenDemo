package hard_Ch20;

public class Random_Set {
	public static int rand(int lower, int higher) { 
		return lower + (int)(Math.random() * (higher - lower + 1));
	}

	/* pick M elements from original array.  Clone original array so that
	 * we don�t destroy the input. */
	public static int[] pickMRandomly(int[] original, int m) {
		for (int i = 0; i < original.length; i++) { 
			int k = rand(0, i);
			int temp = original[k];
			original[k] = original[i];
			original[i] = temp;
		} 
		return original;
	}
	public static String arrayToString(int[] array, int start, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++) {
			int v = array[i];
			sb.append(v + ", ");
		}
		return sb.toString();
	}
	
	public static String arrayToString(int[] array) {
		if (array == null) return "";
		return arrayToString(array, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(arrayToString(cards));
		int[] set = pickMRandomly(cards, 4);
		System.out.println(arrayToString(set));
	}

}
