package app_java_important;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxCharacterFromString {
	public static void main(String[] args) {
		String str="badriprasadverma";
		Entry<Character, Long> entry = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream()
		.max(Map.Entry.comparingByValue()).get();
		System.out.println(entry);
	}
}
