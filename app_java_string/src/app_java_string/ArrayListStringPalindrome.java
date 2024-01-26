package app_java_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStringPalindrome {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("I know malayalam");
		List<String> palin = printPalindrome(asList);
		System.out.println(palin);
	}

	private static List<String> printPalindrome(List<String> asList) {
		ArrayList<String> list=new ArrayList<String>();
		for (String string : asList) {
			String[] split = string.split(" ");
			for (String string2 : split) {
				if(isPalindrome(string2)) {
					list.add(string2);
				}
			}
		}
		return list;
	}

	private static boolean isPalindrome(String string) {
		String string2 = new StringBuilder(string).reverse().toString();
		return string.equalsIgnoreCase(string2);
	}
}
