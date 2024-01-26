package app_java_important;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringOccurence {
	public static void main(String[] args) {
		 String str = "badriprasadverma";
		HashMap<Character, Integer> hash= printStringOccurence(str);
		 for (Entry<Character, Integer> string : hash.entrySet()) {
			System.out.println(string.getKey()+" : "+string.getValue());
		}
	}

	private static HashMap<Character, Integer> printStringOccurence(String str) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		return map;
	}
}
