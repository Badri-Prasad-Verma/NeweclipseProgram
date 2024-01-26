package app_java_important;

public class PairsOfArray {

	public static void main(String[] args) {
		int[] arr= {1,3,2,3,1,4,2};
		
		System.out.println("Input Array");
		printArray(arr);
		System.out.println("Pairs Of Array");
		int pairs = pairsOfArray(arr);
		System.out.println(pairs);
	}

	private static int pairsOfArray(int[] arr) {
		int n=arr.length;
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
