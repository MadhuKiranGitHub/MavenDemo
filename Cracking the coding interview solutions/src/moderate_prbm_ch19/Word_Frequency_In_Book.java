package moderate_prbm_ch19;

public class Word_Frequency_In_Book {
	public static int getFrequency(String[] book, String word) {
		word = word.trim().toLowerCase();
		int count = 0;
		for (String w : book) {
			if (w.trim().toLowerCase().equals(word)) {
				count++;
			}
		}
		return count;
	}
	public static String getLongTextBlob() {
		String book = "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit. "
				+ "Soon Lara spotted other landmarks it an outcropping of limestone beside the path that had a silhouette like a man�s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight."
				+ "Lara had been back and forth along the river path many times in her short life. Her people had not created the path�it had always been there, like the river�but their deerskin-shod feet and the wooden wheels of their handcarts kept the path well worn. Lara�s people were salt traders, and their livelihood took them on a continual journey. ";
		String book_mod = book.replace('.', ' ').replace(',', ' ')
				.replace('-', ' ');
		return book_mod;
	}

	public static String[] getLongTextBlobAsStringList() {
		return getLongTextBlob().split(" ");
	}
	public static void main(String[] args) {
		String[] wordlist = getLongTextBlobAsStringList();
		
		String[] words = {"the", "Lara", "and", "outcropping", "career", "it"};
		for (String word : words) {
			System.out.println(word + ": " + getFrequency(wordlist, word));
		}
	}
}
