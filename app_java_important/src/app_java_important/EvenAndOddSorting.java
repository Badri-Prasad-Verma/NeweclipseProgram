package app_java_important;

import java.util.Scanner;

public class EvenAndOddSorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		System.out.println("Enter Even and Odd number");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Original Array");
		printArray(arr);
		System.out.println("Sorted Array");
		sortedArray(arr);
		printArray(arr);
		
	}

	private static void sortedArray(int[] arr) {
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right) {
			if(arr[left]%2==1 && arr[right]%2==0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			if(arr[left]%2==0) {
				left++;
			}
			if(arr[right]%2==1) {
				right--;
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
