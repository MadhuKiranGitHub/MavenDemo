package hard_Ch20;

public class Distance_Between_Words_In_File {
	public static LocationPair findClosest(String[] words, String word1, String word2) {
		LocationPair best = new LocationPair(-1, -1);
		LocationPair current = new LocationPair(-1, -1);
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.equals(word1)) {
				current.location1 = i;
				best.updateWithMin(current);
			} else if (word.equals(word2)) {
				current.location2 = i;
				best.updateWithMin(current);
			}
		}
		return best;
	}

	public static String getLongTextBlob() {
		String book = "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit. "
				+ "Soon Lara spotted other landmarks�an outcropping of limestone beside the path that had a silhouette like a man�s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight."
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
		String word1 = "river";
		String word2 = "life";
		LocationPair pair = findClosest(wordlist, word1, word2);
		System.out.println("Distance between <" + word1 + "> and <" + word2 + ">: " + pair.toString());		

	}

	
	public static class LocationPair {
		public int location1;
		public int location2;
		public LocationPair(int first, int second) {
			setLocations(first, second);
		}
		
		public void setLocations(int first, int second) {
			this.location1 = first;
			this.location2 = second;
		}
		
		public void setLocations(LocationPair loc) {
			setLocations(loc.location1, loc.location2);
		}	
		
		public int distance() {
			return Math.abs(location1 - location2);
		}
		
		public boolean isValid() {
			return location1 >= 0 && location2 >= 0;
		}
		
		public void updateWithMin(LocationPair loc) {
			if (!isValid() || loc.distance() < distance()) {
				setLocations(loc);
			}
		}
		
		@Override
		public String toString() {
			return "(" + location1 + ", " + location2 + ")";
		}
	}
	
	
}
