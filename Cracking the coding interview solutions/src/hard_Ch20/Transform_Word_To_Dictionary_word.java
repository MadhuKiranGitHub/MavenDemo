package hard_Ch20;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Transform_Word_To_Dictionary_word {

	public static ArrayList<String> wordsOneAway(String word) {
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < word.length(); i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				String w = word.substring(0, i) + c + word.substring(i + 1);
				words.add(w);
			}
		}		
		return words;
	}
	
	public static LinkedList<String> transform(HashSet<String> visited, String startWord, String stopWord, Set<String> dictionary) {
		if (startWord.equals(stopWord)) {
			LinkedList<String> path = new LinkedList<String>();
			path.add(startWord);
			return path;
		} else if (visited.contains(startWord) || !dictionary.contains(startWord)) {
			return null;
		}

		visited.add(startWord);
		ArrayList<String> words = wordsOneAway(startWord);
		
		for (String word : words) {
			LinkedList<String> path = transform(visited, word, stopWord, dictionary);
			if (path != null) {
				path.addFirst(startWord);
				return path;
			}
		}
		
		return null;
	}

	public static LinkedList<String> transform(String start, String stop, String[] words) {
		HashSet<String> dict = setupDictionary(words);
		HashSet<String> visited = new HashSet<String>();
		return transform(visited, start, stop, dict);
	}
	
	public static HashSet<String> setupDictionary(String[] words) {
		HashSet<String> hash = new HashSet<String>();
		for (String word : words) {
			hash.add(word.toLowerCase());
		}
		return hash;
	}

	public static void main(String[] args) {
		String[] words = {"maps", "tan", "tree", "apple", "cans", "help", "aped", "pree", "pret", "apes", "flat", "trap", "fret", "trip", "trie", "frat", "fril"};		
		LinkedList<String> list = transform("tree", "flat", words);
		
		if (list == null) {
			System.out.println("No path.");
		} else {
			System.out.println(list.toString());
		}
	}
	public class PathNode {
		private String word = null;
		private PathNode previousNode = null;
		public PathNode(String word, PathNode previous) {
			this.word = word;
			previousNode = previous;
		}
		
		public String getWord() {
			return word;
		}
		
		/* Traverse path and return linked list of nodes. */
		public LinkedList<String> collapse(boolean startsWithRoot) {
			LinkedList<String> path = new LinkedList<String>();
			PathNode node = this;
			while (node != null) {
				if (startsWithRoot) {
					path.addLast(node.word);
				} else {
					path.addFirst(node.word);
				}
				node = node.previousNode;
			}
			return path;
		}
	}
//	public class BFSData {
//		public Queue<PathNode> toVisit = new LinkedList<PathNode>();
//		public HashMap<String, PathNode> visited = new HashMap<String, PathNode>();
//
//		public BFSData(String root) {
//			PathNode sourcePath = new PathNode(root, null);
//			toVisit.add(sourcePath);
//			visited.put(root, sourcePath);	
//		}
//		
//		public boolean isFinished() {
//			return toVisit.isEmpty();
//		}
//	}

}
