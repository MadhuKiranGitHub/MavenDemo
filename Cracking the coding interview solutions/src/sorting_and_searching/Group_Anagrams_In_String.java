package sorting_and_searching;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Group_Anagrams_In_String {
	public static String groupAnagram(String[] str){
		HashMap<String, ArrayList> hm=new HashMap<String,ArrayList>();
	
		int index=0;
		for(String s:str){
			String key=sort(s);
			if(!hm.containsKey(key)){
				hm.put(key, new ArrayList<String>());
			}
			hm.get(key).add(s);
		}
		
		
		//for each keys in hashmap add key to arraylist
		//ArrayList<String> al=new ArrayList();
		for(String key:hm.keySet()){
			ArrayList<String> al=hm.get(key);
			for(String st:al){
				str[index]=st;
				index++;
			} 
		}
		

		return Arrays.toString(str);
	}
	
	public static String sort(String s){
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	public static void main(String[] args) {
		String input = "my cat ate a tac";
		String[] string=input.split(" ");
		String result=groupAnagram(string);
		
		System.out.println(result);
	}

}
