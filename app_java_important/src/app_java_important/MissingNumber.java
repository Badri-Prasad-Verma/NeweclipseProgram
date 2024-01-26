package app_java_important;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		int miss=missingNumber(arr);
		System.out.println("Missing number is "+miss);
	}

	private static int missingNumber(int[] arr) {
		
		int n=arr.length;
		int expectedValue= (n+1)*(n+2)/2;
		int actualValue=0;
		for (int i = 0; i < arr.length; i++) {
			actualValue=actualValue+arr[i];
		}
		return expectedValue-actualValue;
	}
}
