package app_java_important;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = {65,23,76,34,87,22,98,45};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int n=arr.length;
		if(n>=2) {
			System.out.println(arr[n-2]);
		}else {
			System.out.println("Invalid index");
		}
	}
}
