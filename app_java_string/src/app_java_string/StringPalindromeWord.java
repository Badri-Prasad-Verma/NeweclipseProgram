package app_java_string;

import java.util.ArrayList;
import java.util.List;

public class StringPalindromeWord {
	public static void main(String[] args) {
		String str="I know malayalam";
		String[] split = str.split(" ");
		List<String> paling= printPalindrome(split);
		System.out.println(paling);
	}

	private static List<String> printPalindrome(String[] split) {
		ArrayList<String> list=new ArrayList<String>();
		for (String string : split) {
			if(isPalindrome(string)) {
				list.add(string);
			}
		}
		return list;
	}

	private static boolean isPalindrome(String string) {
		String string2 = new StringBuilder(string).reverse().toString();
		return string.equalsIgnoreCase(string2);
	}
}
