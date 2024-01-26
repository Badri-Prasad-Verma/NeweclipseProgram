package app_java_string;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {

	public static void main(String[] args) {
		String str="badriprasadverma";
		
		Map<String, Long> collect = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(
	Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
				,(e1,e2)->e1,LinkedHashMap::new))
		;
		
		System.out.println(collect);
	}
}
