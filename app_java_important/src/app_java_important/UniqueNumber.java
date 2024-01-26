package app_java_important;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,3,4,1);
		System.out.println("Unique number are");
		printUnique(asList);
	}

	private static void printUnique(List<Integer> asList) {
		Set<Integer> set=new HashSet<Integer>();
		for (Integer integer : asList) {
			if(!set.contains(integer)) {
				System.out.print(integer+" ");
				set.add(integer);
			}
		}
	}
}
