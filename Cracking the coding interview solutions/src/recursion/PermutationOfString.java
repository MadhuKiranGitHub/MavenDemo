package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PermutationOfString {

	public static ArrayList<String> getPerms(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		HashMap<Character, Integer> map=buildFreqTable(s);
		printPerms(map, "", s.length(),permutations );
		return permutations;
	}
	

	private static void printPerms(HashMap<Character, Integer> map, String prefix, int remaining,
			ArrayList<String> permutations) {
		if(remaining==0){
			permutations.add(prefix);
			return;
		}
		for(char c:map.keySet()){
			int count=map.get(c);
			if(count >0){
				map.put(c, count-1);
				printPerms(map,prefix+c,remaining-1,permutations);
				map.put(c, count);
			}
		}
		
	}


	private static HashMap<Character, Integer> buildFreqTable(String s) {
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(char c:s.toCharArray()){
			if(!map.containsKey(c)){
				map.put(c, 0);
			}
			map.put(c, map.get(c)+1);
		}
		return map;
	}


	public static void main(String[] args) {
		ArrayList<String> perm = new ArrayList<String>();
		String str="abc";
		perm=getPerms(str);
		for(String s:perm){
			System.out.print(s+ " ");
		}

	}

}
