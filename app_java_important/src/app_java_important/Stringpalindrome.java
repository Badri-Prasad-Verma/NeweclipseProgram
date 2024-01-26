package app_java_important;

public class Stringpalindrome {
	public static void main(String[] args) {
		String str="A man a plan a canal Panama";
		boolean bool=printPalindromeString(str);
		System.out.println(bool);
	}

	private static boolean printPalindromeString(String str) {
		str=str.replaceAll("\\s","").toLowerCase();
		String string = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(string);
	}
}
