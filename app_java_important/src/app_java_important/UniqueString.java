package app_java_important;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {
	public static void main(String[] args) {
		String str="badriprasad";
		System.out.println("Unique Character in the string : ");
		printUnique(str);
	}

	private static void printUnique(String str) {
		Set<Character> set=new HashSet<Character>();
		for (Character ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				System.out.print(ch+" ");
				set.add(ch);
			}
		}
	}
}
