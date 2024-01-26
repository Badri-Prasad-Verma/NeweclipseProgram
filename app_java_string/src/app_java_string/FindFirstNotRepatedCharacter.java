package app_java_string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNotRepatedCharacter {

	public static void main(String[] args) {
		String str="badriprasadverma";
		String key = Arrays.asList(str.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity()
				,LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).findFirst()
		.get().getKey();
		
		System.out.println(key);
	}
}
