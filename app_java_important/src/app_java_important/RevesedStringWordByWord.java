package app_java_important;

public class RevesedStringWordByWord {

	public static void main(String[] args) {
		String originalString="I love my country";
		
		StringBuilder reversedString=new StringBuilder();
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
		reversedString.insert(0, currentString);
		
		System.out.println(reversedString.toString());
	}
}
