package app_java_important;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupsOfAnagram {
	public static void main(String[] args) {
		String[] string= {"eat", "tea", "ate", "bat","tab","nab"};
		List<List<String>> anag=printAnagramString(string);
		System.out.println(anag);
	}

	private static List<List<String>> printAnagramString(String[] string) {
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		for (String str : string) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sorted=new String(charArray);
			map.computeIfAbsent(sorted, k->new ArrayList<>()).add(str);
		}
		return new ArrayList<>(map.values());
	}
}
