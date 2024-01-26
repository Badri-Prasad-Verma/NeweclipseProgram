package app_java_1;

public class C {

	public static void main(String[] args) {
		String originalString="I";
		StringBuilder reverse=reverseString(originalString);
		System.out.println(reverse);
	}

	private static StringBuilder reverseString(String originalString) {
		StringBuilder reversedString = new StringBuilder();
		StringBuilder currentString=new StringBuilder();
		for (int i = 0; i < originalString.length(); i++) {
			char charAt = originalString.charAt(i);
			if(charAt==' ') {
				reversedString.insert(0, currentString).insert(0, ' ');
				currentString.setLength(0);
			}else {
				currentString.append(charAt);
			}
		}
		return reversedString.insert(0, currentString);
	}
}
