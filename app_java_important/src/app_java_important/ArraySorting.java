package app_java_important;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr= {11,33,22,44,66,55,88,77,99};
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
